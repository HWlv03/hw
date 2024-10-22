package model;

public class Order {
    private String soure, type;
    private int age, quantity;
    private double price;
    private boolean vaccinationStatus;

    public Order() {
    }

    public Order(String soure, String type, int age, int quantity, double price, boolean vaccinationStatus) {
        this.soure = soure;
        this.type = type;
        this.age = age;
        this.quantity = quantity;
        this.price = price;
        this.vaccinationStatus = vaccinationStatus;
    }

    public String getSoure() {
        return soure;
    }

    public void setSoure(String soure) {
        this.soure = soure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(boolean vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }
}
