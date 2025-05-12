package carinspection;

public interface IJob {
    int getMinNumberOfWorkers();
    double getBasePrice();
    int getHours();
    boolean getStatus();
    void setStatus(boolean status);
    String toString();

}
