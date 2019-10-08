package com.genericsl.genericsl;

public class Order {

    //Propiedades
    private String title;
    private String nameCompany;
    private int imageProduct;
    private int amount;
    private double priceForUnit;
    private double priceTotal;


    //Getter and SeTTer
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        this.imageProduct = imageProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPriceForUnit() {
        return priceForUnit;
    }

    public void setPriceForUnit(double priceForUnit) {
        this.priceForUnit = priceForUnit;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }



    //Construct

    public Order(String title, String nameCompany, int imageProduct, int amount, double priceForUnit, double priceTotal) {
        this.title = title;
        this.nameCompany = nameCompany;
        this.imageProduct = imageProduct;
        this.amount = amount;
        this.priceForUnit = priceForUnit;
        this.priceTotal = priceTotal;
    }



}
