package com.example.postobon;

public class Trabajador {

    //ATRIBUTOS
    String nombreTrabajador;
    int fotoTrabajador;

    //CONSTRUCTOR
    public Trabajador(String nombreTrabajador, int fotoTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
        this.fotoTrabajador = fotoTrabajador;
    }

    //METODOS
    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getFotoTrabajador() {
        return fotoTrabajador;
    }

    public void setFotoTrabajador(int fotoTrabajador) {
        this.fotoTrabajador = fotoTrabajador;
    }
}
