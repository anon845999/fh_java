package objektorientierungw3schools;

 public abstract class Person{
    private String name;
    private int age;
    private int phoneNumber;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }
    public Person(){}

public String getName(){
        return name;
}
public int getAge(){
        return age;
}
public void setName(String name){
        this.name = name;
}
public void setAge(int age){
        this.age = age;
}

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append("]");
        return builder.toString();
    }


}
