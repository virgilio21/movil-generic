package com.genericsl.genericsl;

public class Categories {

    private int imageCategories;
    private String title;



    //Constructor
    public Categories( String title, int imageCategories ) {
        this.title = title;
        this.imageCategories = imageCategories;

    }




    //Getter And Setters
    public int getImageCategories() {
        return imageCategories;
    }

    public void setImageCategories(int imageCategories) {
        this.imageCategories = imageCategories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
