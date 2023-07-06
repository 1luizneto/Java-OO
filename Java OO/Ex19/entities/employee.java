package entities;

public class employee {

    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
        return grossSalary *= (percentage / 100);
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }

}
