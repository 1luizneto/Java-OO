package entiteis;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
    }
    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxa = 0.0;
        if (getNumberOfEmployees() > 10){
            taxa += getAnualIncome() * 0.14;
        } else {
            taxa += getAnualIncome() * 0.10;
        }
        return taxa;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
