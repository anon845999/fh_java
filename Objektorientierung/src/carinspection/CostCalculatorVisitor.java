package carinspection;

public class CostCalculatorVisitor implements IVisitor{
    private double totalCost = 0;
    private double costPerJunior = 0;
    private double costPerSenior = 0;
    private double hoursPerWorker;

    public CostCalculatorVisitor(double hoursPerWorker) {
        this.hoursPerWorker = hoursPerWorker;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public double getCostPerJunior() {
        return costPerJunior;
    }
    public double getCostPerSenior() {
        return costPerSenior;
    }
    public double getHoursPerWorker() {
        return hoursPerWorker;
    }


    @Override
    public void visit(JuniorWorker junior) {
        double cost = junior.getHourlyRate() * hoursPerWorker;
        totalCost += cost;
        costPerJunior += cost;
    }

    @Override
    public void visit(SeniorWorker senior) {
        double cost = senior.getHourlyRate() * hoursPerWorker;
        totalCost += cost;
        costPerSenior += cost;
    }
}
