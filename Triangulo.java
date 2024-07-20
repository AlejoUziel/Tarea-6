package com.mycompany.modulocinco;

public class Triangulo extends Forma {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja un triangulo");
    }
}
