package com.genericsl.genericsl;

public class Source {
    String company;
    String product;
    float price;
    float ranking;
    int imagen;

    public Source(String company, String product, float price, float ranking, int imagen) {
        this.company = company;
        this.product = product;
        this.price = price;
        this.ranking = ranking;
        this.imagen = imagen;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRanking() {
        return ranking;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
