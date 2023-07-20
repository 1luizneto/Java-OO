package entiteis;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double taxa = 0.0;
        if (getAnualIncome() > 20000.0){
            taxa += (getAnualIncome() * 0.25) - (getHealthExpenditures() * 0.5);
        } else {
            taxa += getAnualIncome() + (getAnualIncome() * 0.15);
        }
        return taxa;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures){
        this.healthExpenditures = healthExpenditures;
    }
}
