package CoronaTest;

import java.util.List;

public class Person
{
    private String name;
    private Date birthday;
    private List<CoronaTests> coronaTests;

    public Person(String name, Date birthday,List<CoronaTests> coronaTests) {
        this.name = name;
        this.birthday = birthday;
        this.coronaTests = coronaTests;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public List<CoronaTests> getCoronaTests() {
        return coronaTests;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public void setTests(CoronaTests coronaTests){
        this.coronaTests.add(coronaTests);
    }

    public CoronaTests lastTestBeforeDate(CoronaTests test){
        return coronaTests.get(this.coronaTests.size()-1);
        //in construction
    }
    public String coronaStatus(Date testDate){
        return "";
    }

}
