package carinspection;

public interface IVisitor {
  void visit(JuniorWorker juniorworker);
  void visit(SeniorWorker seniorworker);
}