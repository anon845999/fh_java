package CoronaTest;

public class PcrTest extends CoronaTests{

    public PcrTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }

    @Override
    public Date validUntil() {
        return null;
    }


}
