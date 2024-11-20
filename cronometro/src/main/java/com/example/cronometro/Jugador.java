package com.example.cronometro;

public class Jugador {
    private String nombre;
    private int id;
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.id = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
