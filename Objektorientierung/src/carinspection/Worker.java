package carinspection;

import java.util.List;

public abstract class Worker {
    protected String name;
    protected int hourlyRate;
    public Worker(String name) {
        this.name = name;
    }

    public abstract int getHourlyRate();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void addWorkerToList(List<Worker> workers){
        workers.add(this);
    }
    public abstract void accept(IVisitor visitor);
}
