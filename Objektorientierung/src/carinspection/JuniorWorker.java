package carinspection;

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


}
