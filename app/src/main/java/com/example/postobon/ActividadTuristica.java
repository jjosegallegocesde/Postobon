package com.example.postobon;

public class ActividadTuristica {

    String nombre;
    int foto1, foto2;

    public ActividadTuristica(String nombre, int foto1, int foto2) {
        this.nombre = nombre;
        this.foto1 = foto1;
        this.foto2 = foto2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }
}
