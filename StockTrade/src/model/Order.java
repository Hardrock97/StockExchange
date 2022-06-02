package model;

public class Order {
    // instance variables
    private String orderID;
    private String stockTime;
    private String stock;
    private String buySell ;
    private double price;
    private int quantity;
    // constructure
    public Order(String orderID, String stockTime, String stock, String buySell, double price, int quantity) {
        this.orderID = orderID;
        this.stockTime = stockTime;
        this.stock = stock;
        this.buySell = buySell;
        this.price = price;
        this.quantity = quantity;
    }
    // getters and setters
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStockTime() {
        return stockTime;
    }

    public void setStockTime(String stockTime) {
        this.stockTime = stockTime;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
