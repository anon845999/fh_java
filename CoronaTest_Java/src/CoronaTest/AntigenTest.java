package CoronaTest;

public class AntigenTest extends CoronaTest {

    public AntigenTest(Date testDate,boolean isPositive){
        super(testDate,isPositive);
    }

    @Override
    public Date validUntil() {
        return null;
    }
}
