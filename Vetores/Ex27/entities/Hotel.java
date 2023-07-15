package entities;

public class Hotel {

    private String name;
    private String email;
    private int quarto;

    public Hotel(String name, String email, int quarto) {
        setName(this.name = name);
        setEmail(this.email = email);
        setQuarto(this.quarto = quarto);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return  "Busy rooms: " +
                 getQuarto() +
                ": " + getName() +
                ", " + getEmail();
    }
}
