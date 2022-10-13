package com.curso2.unidade4.desenho;

import java.util.ArrayList;

public class Desenhista {
    private ArrayList<Figura> figuras = new ArrayList<Figura>();
    public static void main(String[] args) {
        Desenhista desenhista = new Desenhista();
        desenhista.desenhaCirculo();
        desenhista.desenhaQuadrado();
        desenhista.desenhaTriangulo();
    }

    public void desenhaCirculo(){
        Figura circulo = new Circulo();
        circulo.desenha();
        this.figuras.add(circulo);
    }

    public void desenhaTriangulo(){
        Figura triangulo = new Triangulo();
        triangulo.desenha();
        this.figuras.add(triangulo);
    }

    public void desenhaQuadrado(){
        Figura quadrado = new Quadrado();
        quadrado.desenha();
        this.figuras.add(quadrado);
    }
}
