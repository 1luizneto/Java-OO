package entities;

public class Department {
    private String name;

    public Department() {
    }

    public Department(String name) {
        setName(this.name = name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
