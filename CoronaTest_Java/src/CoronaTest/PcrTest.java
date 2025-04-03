package CoronaTest;

public class PcrTest extends CoronaTests{

    public PcrTest(Date testDate, boolean isPositive) {
        super(testDate, isPositive);
    }

    @Override
    public Date validUntil() {
        return null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("PcrTest");
        sb.append("\n");
        sb.append("isPositive: \n");
        return sb.toString();

    }
}
