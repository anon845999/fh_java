package Tournaments;

import java.util.Objects;

public class CParticipant {

    private final int ID;
    private String name;
    private int age;

    public CParticipant(String name, int age) {
        this.ID = CParticipantIdGenerator.getInstance().getNextId();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CParticipant that = (CParticipant) o;
        return ID==that.ID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Age: " + age;
    }
}
