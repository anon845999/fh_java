package CoronaTest;

public abstract class CoronaTest {
    private boolean isPositive;
    private Date testDate;
    private CoronaTest test;

    public CoronaTest(Date testDate, boolean isPositive) {
        this.isPositive = isPositive;
        this.testDate = testDate;
    }
    public CoronaTest(CoronaTest test) {
        this.test = test;
    }

    public Date getTestDate() {
        return testDate;
    }
    public boolean isPositive() {
        return isPositive;
    }
    public abstract Date validUntil();
    public String outcome(){
        return "HMM";
    }

}
