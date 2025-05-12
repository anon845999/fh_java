package carinspection;

public class CarInspection implements IJob{

    private boolean isPossibleToMaintain = false;

    private final Car car;
    public CarInspection(Car car){
        this.car = car;
    }

    @Override
    public int getMinNumberOfWorkers() {
        return 2;
    }

    @Override
    public double getBasePrice() {
        if(this.car == null){
            return 0.0;
        }
        double basePrice;
        if(this.car.getYear() < 2000){
            basePrice = 200.0;
        }else
            basePrice = 150.0;
        return basePrice;
    }


    public void setIsPossibleToMaintain(boolean isPossibleToMaintain) {
        this.isPossibleToMaintain = isPossibleToMaintain;
    }
    @Override
    public int getHours() {
        return 10;
    }

    @Override
    public boolean getStatus() {
        return isPossibleToMaintain;
    }

    @Override
    public void setStatus(boolean status) {
        this.isPossibleToMaintain = status;
    }

    @Override
    public String toString() {
        return "CarInspection{" +
                "isPossible=" + isPossibleToMaintain +
                ", car=" + car +
                '}';
    }


}
