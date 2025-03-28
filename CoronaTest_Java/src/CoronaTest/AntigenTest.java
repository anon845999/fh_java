package CoronaTest;

public class AntigenTest extends CoronaTests{

    public AntigenTest(Date testDate,boolean isPositive){
        super(testDate,isPositive);
    }

    @Override
    public Date validUntil() {
        return null;
    }
}
