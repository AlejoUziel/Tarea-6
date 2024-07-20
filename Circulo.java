package com.mycompany.modulocinco;

public class Circulo extends Forma {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja un circulo");
    }
}
