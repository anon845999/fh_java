package visitorpattern;

import carinspection.*;

public interface IVisitor {
    public double visit(JuniorWorker juniorworker);
    public double visit(SeniorWorker seniorworker );
}
