package com.genericsl.genericsl;
public class Fuente {

    public Fuente(String titulo, int imagen, float precio, float ranking) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.precio = precio;
        this.ranking = ranking;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getRanking() {
        return ranking;
    }

    public void setRanking(float ranking) {
        this.ranking = ranking;
    }

    String titulo;
    int imagen;
    float precio;
    float ranking;


}
