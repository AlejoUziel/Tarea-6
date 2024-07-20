package com.mycompany.modulocinco;

public class Figuras {
    public static void main(String[] args) {
        double radio = 8.0;
        Circulo miCirculo = new Circulo(radio);
        Linea linea = new Linea(20.0);
        Triangulo triangulo = new Triangulo(15.0, 10.0); // Altura definida como 10.0
        Cuadrado cuadrado = new Cuadrado(7.0);

        miCirculo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();

        double areaCirculo = miCirculo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();
        double areaCuadrado = cuadrado.calcularArea();

        System.out.println("area del circulo: " + areaCirculo);
        System.out.println("area del triangulo: " + areaTriangulo);
        System.out.println("area del cuadrado: " + areaCuadrado);
    }
}
