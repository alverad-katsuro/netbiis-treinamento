package com.curso2.unidade4.sisalucar;

public abstract class Veiculo {
    protected float velocidade;
    protected String placa;
    protected String potencia;
    protected float max_gasolina;
    protected float gasolina;
    protected boolean ligado = false;
    protected Revendedor revendedor;
    protected String motor;
    protected String modelo;
    protected String cor;
    protected String fabricante;
    protected int ano;
    protected float valorDiaria;
    protected int passageiro;
    
    public abstract void acelera(int velocidade);

    public void desacelera(int velocidade){
        if (getVelocidade() - velocidade < 0) {
            setVelocidade(0);
        } else {
            setVelocidade(getVelocidade() - velocidade);
        }
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
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
    public Revendedor getRevendedor() {
        return revendedor;
    }
    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public int getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    
}
