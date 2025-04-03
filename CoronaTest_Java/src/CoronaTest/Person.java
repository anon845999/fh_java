package CoronaTest;

public class Person {
    private String name;
    private Date birthday;
    private CoronaTests[] tests;

    public Person(String name, Date birthday, CoronaTests[] coronaTests) {
        this.name = name;
        this.birthday = birthday;
        setTests(coronaTests);

    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public CoronaTests[] getCoronaTests() {
        return tests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setTests(CoronaTests[] coronaTests) {
        CoronaTests[] newCoronaTests = new CoronaTests[coronaTests.length];
        System.arraycopy(coronaTests, 0, newCoronaTests, 0, coronaTests.length);
        tests = newCoronaTests;
    }

    public CoronaTests lastTestBeforeDate(CoronaTests test) {
        if (test != null) {
            for (var item : tests) {
                if (item.getTestDate() == test.getTestDate()) {
                    return item;
                }
            }
        }

        return null;

    }

    public String coronaStatus(Date testDate) {

        return "";
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("\n");
        sb.append("birthday: " + birthday);
        sb.append("\n");
        sb.append("tests: ");
        for (CoronaTests test : tests) {
            sb.append(test.isPositive()+ "");
        }
        return sb.toString();
    }
}
