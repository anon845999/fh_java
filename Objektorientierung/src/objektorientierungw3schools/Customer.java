package objektorientierungw3schools;

public class Customer extends Person {
    private int salary;

    public Customer(int salary, String name) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
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
        String s = super.toString();
        return s + "\nSalary: " + salary;
    }



}
