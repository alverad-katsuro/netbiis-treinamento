package com.curso2.unidade4.desenho;

public sealed abstract class Figura permits Quadrado, Circulo, Triangulo  {
    
    public abstract void desenha();
}
