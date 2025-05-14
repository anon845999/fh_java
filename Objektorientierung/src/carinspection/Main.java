package carinspection;

public class Main {
    public static void main(String[] args) {
        Workshop w = new Workshop();
        //w.addWorker(new SeniorWorker("Tom"));

        w.addWorker(new JuniorWorker("John"));
        w.addWorker(new JuniorWorker("Jane"));

     //   w.addWorker(new SeniorWorker("Manfred"));
        w.setJob(new CarInspection(new Audi(2010)));
        w.printReport();


    }
}
