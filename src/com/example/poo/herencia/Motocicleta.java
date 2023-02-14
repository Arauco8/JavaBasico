package com.example.poo.herencia;

import com.example.poo.clases.Motor;
import com.example.poo.clases.Vehiculo;

/**
 * Clase derivada o clase hija o subclase
 */
public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta(){

    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}