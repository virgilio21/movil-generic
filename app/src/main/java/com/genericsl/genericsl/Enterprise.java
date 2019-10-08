package com.genericsl.genericsl;

public class Enterprise {

    private String name;
    private int imageEnterprise;
    private String serviceDomicile;
    private String ubication;

    public Enterprise(String name, int imageEnterprise, String serviceDomicile, String ubication) {
        this.name = name;
        this.imageEnterprise = imageEnterprise;
        this.serviceDomicile =  serviceDomicile;
        this.ubication = ubication;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageEnterprise() {
        return imageEnterprise;
    }

    public void setImageEnterprise(int imageEnterprise) {
        this.imageEnterprise = imageEnterprise;
    }

    public String getServiceDomicile() {
        return serviceDomicile;
    }

    public void setServiceDomicile(String serviceDomicile) {
        this.serviceDomicile = serviceDomicile;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }



}
