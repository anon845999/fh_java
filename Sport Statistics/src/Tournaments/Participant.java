package Tournaments;

public class Participant {

    private final int ID;
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.ID = ParticipantIdGenerator.getInstance().getNextId();
        this.name = name;
        this.age = age;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Age: " + age;
    }
}
