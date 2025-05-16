package at.fh.dto;

public class SoftwareEngineerDTO {

    private long id;
    private String name;
    private String techStack;

    public SoftwareEngineerDTO() {
    }

    public SoftwareEngineerDTO(String name, String techStack) {
        this.name = name;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTechStack() {
        return techStack;
    }
    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
    @Override
    public String toString() {
        return "SoftwareEngineerDTO{" +
                "name='" + name + '\'' +
                ", techStack='" + techStack + '\'' +
                '}';
    }
}


