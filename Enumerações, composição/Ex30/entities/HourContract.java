package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        setDate(this.date = date);
        setValuePerHour(this.valuePerHour = valuePerHour);
        setHours(this.hours = hours);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return getValuePerHour() * getHours();
    }
}
