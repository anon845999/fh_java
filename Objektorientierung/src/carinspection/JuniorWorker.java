package carinspection;

import java.util.List;

public class JuniorWorker extends Worker {

    public JuniorWorker(String name) {
        super(name);
        super.hourlyRate = 20;
    }
    @Override
    public int getHourlyRate() {
        return 20;
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
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }


}
