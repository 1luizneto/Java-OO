package entities;

import java.util.List;
import java.util.Objects;

public class Employees {
    private Integer id;
    private String name;
    private Double salary;

    public Employees(Integer id, String name, Double salary) {
        setId(this.id = id);
        setName(this.name = name);
        setSalary(this.salary = salary);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

    @Override
	public String toString() {
		return getId() +
                ", " + getName() +
                ", " + String.format("%.2f", getSalary());
	}
}
