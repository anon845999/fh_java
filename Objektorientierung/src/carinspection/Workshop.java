package carinspection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Workshop {

  //  private List<Worker> juniors = new ArrayList<>();
  //  private List<Worker> seniors = new ArrayList<>();
    private List<Worker> workers = new ArrayList<>();
    private Map<Class<Worker>,Double> workerMap = new HashMap<>();
    private IJob job;
    private double totalCostJuniorsAndSeniors;
    private double totalCostPerJunior;
    private double totalCostPerSenior;
    private int totalHours;

    public Workshop() {
    }

    public void printReport() {
        boolean result = inspect();
        System.out.println("Workshop report:");
        System.out.println("Job: " + job.toString());
        System.out.println("Number of workers required: " + job.getMinNumberOfWorkers());
        System.out.println("Number of actual workers: " + getActualWorkerSize());
        System.out.println("Hours needed: " + job.getHours());

        if (result) {
            System.out.println("Total cost: " + getTotalCostJuniorsAndSeniors());
            System.out.println("Total cost per Junior: " + getTotalCostPerJunior());
            System.out.println("Total cost per Senior: " + getTotalCostPerSenior());
            System.out.println("Total hours: " + getTotalHours());
            System.out.println("Status: possible");
        } else {
            if (!enoughSeniors()) {
                System.out.println("Status: not possible – Reason: 1 senior worker required");
            } else {
                System.out.println("Status: not possible – Reason: not enough workers");
            }
        }
    }

    public int getActualWorkerSize() {
        return workers.size();
    }

    public boolean inspect() {
        if (job == null) {
            throw new IllegalArgumentException("Job is null");
        }
        boolean valid = enoughWorkers();
        job.setStatus(valid);
        return valid;
    }

    public boolean enoughSeniors() {
        for (Worker worker : workers) {
            if (worker instanceof SeniorWorker) {
                return true;
            }
        }
        return false;
    }

    public boolean enoughWorkers() {
        return isJobSet()
                && enoughSeniors()
                && getActualWorkerSize() >= job.getMinNumberOfWorkers();
    }

    public boolean isJobSet() {
        return job != null;
    }

    public double getTotalCostJuniorsAndSeniors() {
        totalCostJuniorsAndSeniors = job.getBasePrice();
        totalCostPerJunior = 0;
        totalCostPerSenior = 0;
        totalHours = job.getHours();
        double hoursPerWorker = (double) totalHours / getActualWorkerSize();

        CostCalculatorVisitor visitor = new CostCalculatorVisitor(hoursPerWorker);
        for (Worker worker : workers) {
            worker.accept(visitor);
        }
        totalCostPerJunior = visitor.getCostPerJunior();
        totalCostPerSenior = visitor.getCostPerSenior();
        totalCostJuniorsAndSeniors = job.getBasePrice() + visitor.getTotalCost();
        return totalCostJuniorsAndSeniors;
    }

    private double getTotalCostPerJunior() {
        return totalCostPerJunior;
    }

    private double getTotalCostPerSenior() {
        return totalCostPerSenior;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void addWorker(Worker worker) {
        if (worker == null) {
            throw new IllegalArgumentException("Worker is null");
        }
        worker.addWorkerToList(workers);
    }

    public void setJob(IJob job) {
        this.job = job;
    }
}