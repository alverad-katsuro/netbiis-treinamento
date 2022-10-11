
/*
Unidade 2 - pag 99
DECLARACAO DE CONSTANTE:
  num_avaliacoes = 4;

DECLARACAO DE VARIAVEL:
  real saldo_bancario;
  inteiro numero_irmaos;
  caracter texto_prova;
  logico porta;

INICIO

saldo_bancario << 188.0;
numero_irmaos << 7; 
texto_prova << 'Ao amanhecer o galo cacarejou';
porta << 'aberta';

*/



package com.curso1.unidade_two;

public class Pagina99 {
  private final int num_avaliacoes = 4;
  private float saldo_bancario;
  private int numero_irmaos;
  private String texto_prova;
  private boolean porta;

    public static void main(String[] args) {
        //Pagina99 atividade_dois = new Pagina99(1550.0f, 8, "É amanhã a prova", true);      
    }
  

    public Pagina99(float saldo_bancario, int numero_irmaos, String texto_prova, boolean porta) {
        this.saldo_bancario = saldo_bancario;
        this.numero_irmaos = numero_irmaos;
        this.texto_prova = texto_prova;
        this.porta = porta;
    }

    @Override
    public String toString() {
        if (porta) {
            return "Pagina99 [num_avaliacoes=" + num_avaliacoes + ", numero_irmaos=" + numero_irmaos + ", porta=aberta"
                    + ", saldo_bancario=" + saldo_bancario + ", texto_prova=" + texto_prova + "]";
        } else {
            return "Pagina99 [num_avaliacoes=" + num_avaliacoes + ", numero_irmaos=" + numero_irmaos + ", porta=fechada"
                    + ", saldo_bancario=" + saldo_bancario + ", texto_prova=" + texto_prova + "]";
        }
    }

    public int getNum_avaliacoes() {
        return num_avaliacoes;
    }

    public float getSaldo_bancario() {
        return saldo_bancario;
    }

    public void setSaldo_bancario(float saldo_bancario) {
        this.saldo_bancario = saldo_bancario;
    }

    public int getNumero_irmaos() {
        return numero_irmaos;
    }

    public void setNumero_irmaos(int numero_irmaos) {
        this.numero_irmaos = numero_irmaos;
    }

    public String getTexto_prova() {
        return texto_prova;
    }

    public void setTexto_prova(String texto_prova) {
        this.texto_prova = texto_prova;
    }

    public boolean isPorta() {
        if (porta) {
            System.out.println("Porta Aberta");
        } else {
            System.out.println("Porta Fechada");
        }
        return porta;
    }

    public void setPorta(boolean porta) {
        this.porta = porta;
    }
  
}
