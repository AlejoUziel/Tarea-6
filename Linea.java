package com.mycompany.modulocinco;

public class Linea extends Forma {
    private final double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return 0; // Una línea no tiene área (ejemplo)
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja una linea de largo " + largo);
    }
}
