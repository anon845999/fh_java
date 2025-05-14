package carinspection;

import java.util.List;

public class JuniorWorker extends Worker {

    public JuniorWorker(String name) {
        super(name);
    }
    @Override
    public int getHourlyRate() {
        return 20;
    }

    @Override
    public boolean isSenior() {
        return false;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


}
