package carinspection;

import java.util.List;

public class SeniorWorker extends Worker {

    public SeniorWorker(String name) {
        super(name);

    }

    @Override
    public int getHourlyRate() {
        return 50;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isSenior() {
        return true;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}


