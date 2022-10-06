package com.curso2.unidade4;

public class Carro {
    private static int idAllCarro = 0;
    private int idCarro;
    private String motor;
    private String modelo;
    private String cor;
    private String potencia;
    private String fabricante;
    private float velocidade;
    private float max_gasolina;
    private float gasolina;
    private boolean ligado = false;
    private int ano;
    private float valorDiaria;
    private String placa;
    private Revendedor revendedor;

    public Carro(){
        this.idCarro = getIdAllCarro();
        Carro.incIdAllCarro();        
    }

    public Carro(String modelo, String cor, String fabricante, String motor, int ano, float valorDiaria, String placa, Revendedor revendedor){
        this.idCarro = getIdAllCarro();
        Carro.incIdAllCarro();
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.fabricante = fabricante;
        this.valorDiaria = valorDiaria;
        this.placa = placa;
        this.ano = ano;
        this.revendedor = revendedor;
    }
    
    
    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }

    public static void setIdAllCarro(int idAllCarro) {
        Carro.idAllCarro = idAllCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int getIdAllCarro() {
        return idAllCarro;
    }
    public static void incIdAllCarro() {
        Carro.idAllCarro = Carro.idAllCarro++;
    }
    public int getIdCarro() {
        return idCarro;
    }
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public float getMax_gasolina() {
        return max_gasolina;
    }
    public void setMax_gasolina(float max_gasolina) {
        this.max_gasolina = max_gasolina;
    }
    public float getGasolina() {
        return gasolina;
    }
    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void LigaDesliga(){
        this.ligado = !isLigado();
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
