package carinspection;

import java.util.List;

public class SeniorWorker extends Worker {

    public SeniorWorker(String name) {
        super(name);
        super.hourlyRate = 50;
    }

    @Override
    public int getHourlyRate() {
        return 50;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setHourlyRate(int hourlyRate) {
        super.setHourlyRate(hourlyRate);
    }



    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}


