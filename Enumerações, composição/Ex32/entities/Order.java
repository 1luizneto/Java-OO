package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        setMoment(this.moment = moment);
        setStatus(this.status = status);
        setClient(this.client = client);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItem() {
        return itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public Double total() {
        double total = 0;
        for (OrderItem x : itens) {
            total += x.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMARY:" + "\n");
        sb.append("Order moment: ");
        sb.append(sdf.format(getMoment()));
        sb.append("\n");
        sb.append("Order statud: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(getClient()).append("\n");
        sb.append("Order items: " + "\n");
        for (OrderItem x : itens) {
            sb.append(x.getProduct().getName()).append(", ");
            sb.append("$").append(x.getProduct().getPrice()).append(", ");
            sb.append("Quantity: ").append(x.getQuantity()).append(", ");
            sb.append("SubTotal: ").append(String.format("%.2f", x.subTotal()));
            sb.append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }   
}
