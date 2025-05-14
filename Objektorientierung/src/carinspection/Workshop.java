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
        System.out.println("Workshop report:");
        System.out.println("Job: " + job);
        System.out.println("Number of workers required: " + job.getMinNumberOfWorkers());
        System.out.println("Number of actual workers: " + getActualWorkerSize());
        System.out.println("Hours needed: " + job.getHours());

        if (isJobPossible()) {
            System.out.printf("Total cost: %.2f\n", getTotalCostJuniorsAndSeniors());
            System.out.printf("Total cost per Junior: %.2f\n", totalCostPerJunior);
            System.out.printf("Total cost per Senior: %.2f\n", totalCostPerSenior);
            System.out.println("Total hours: " + totalHours);
            System.out.println("Status: possible");
        } else {
            System.out.println("Status: not possible – Reason: " +
                    (!enoughSeniors() ? "1 senior worker required" : "not enough workers"));
        }
    }

    public int getActualWorkerSize() {
        return workers.size();
    }

    public boolean isJobPossible() {
        if (job == null) {
            throw new IllegalArgumentException("Job is null");
        }
        boolean valid = enoughWorkers();
        job.setStatus(valid);
        return valid;
    }

    public boolean enoughSeniors() {
        return workers.stream().anyMatch(Worker::isSenior);
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

    public double getTotalCostPerJunior() {
        return totalCostPerJunior;
    }

    public double getTotalCostPerSenior() {
        return totalCostPerSenior;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void addWorker(Worker worker) {
        if (worker == null) {
            throw new IllegalArgumentException("Worker is null");
        }
        workers.add(worker);
    }

    public void setJob(IJob job) {
        this.job = job;
    }
}