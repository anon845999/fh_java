package CoronaTest;
import java.util.*;
public abstract class CoronaTests {
    private boolean isPositive;
    private Date testDate;
    private CoronaTests test;

    public CoronaTests(Date testDate,boolean isPositive) {
        this.isPositive = isPositive;
        this.testDate = testDate;
    }
    public CoronaTests(CoronaTests test) {
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
