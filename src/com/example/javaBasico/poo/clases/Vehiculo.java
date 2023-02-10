package com.example.javaBasico.poo.clases;

/**
 * Clase base o superclase o clase padre
 */
public class Vehiculo {

    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // 2. constructores
    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    // 3. métodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    // getter y setter

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // toString


    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", speed=" + speed +
                ", motor=" + motor +
                '}';
    }

}