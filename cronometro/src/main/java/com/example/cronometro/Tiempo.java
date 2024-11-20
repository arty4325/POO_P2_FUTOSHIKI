package com.example.cronometro;

public class Tiempo {
    private int milisegundos;
    private int segundos;
    private int minutos;
    private int horas;
    public Tiempo() {
        this.milisegundos = 0;
        this.segundos = 0;
        this.minutos = 0;
        this.horas = 0;
    }
    public Tiempo(int milisegundos, int segundos, int minutos, int horas) {
        this.milisegundos = milisegundos;
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public int getMilisegundos() {
        return milisegundos;
    }
    public void setMilisegundos(int milisegundos) {
        this.milisegundos = milisegundos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

}
