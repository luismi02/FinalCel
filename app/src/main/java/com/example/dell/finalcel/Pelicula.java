package com.example.dell.finalcel;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private int id;
    private String titulo;
    private int año;
    private int duracion;
    private String genero;
    private Double precio;
    private String sinopsis;
    private int imagen;

    public Pelicula() {

    }

    public Pelicula(int id, String titulo, int año, int duracion, String genero, double precio, String sinopsis, int imagen) {
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
