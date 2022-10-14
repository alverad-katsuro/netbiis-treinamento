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

    
    /** 
     * @param velocidade
     */
    public void desacelera(int velocidade){
        if (getVelocidade() - velocidade < 0) {
            setVelocidade(0);
        } else {
            setVelocidade(getVelocidade() - velocidade);
        }
    }

    
    /** 
     * @return String
     */
    public String getMotor() {
        return motor;
    }
    
    /** 
     * @param motor
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    /** 
     * @return String
     */
    public String getModelo() {
        return modelo;
    }
    
    /** 
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /** 
     * @return String
     */
    public String getCor() {
        return cor;
    }
    
    /** 
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    /** 
     * @return String
     */
    public String getFabricante() {
        return fabricante;
    }
    
    /** 
     * @param fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    /** 
     * @return int
     */
    public int getAno() {
        return ano;
    }
    
    /** 
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /** 
     * @return float
     */
    public float getVelocidade() {
        return velocidade;
    }
    
    /** 
     * @param velocidade
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    /** 
     * @return String
     */
    public String getPlaca() {
        return placa;
    }
    
    /** 
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /** 
     * @return String
     */
    public String getPotencia() {
        return potencia;
    }
    
    /** 
     * @param potencia
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
    /** 
     * @return float
     */
    public float getMax_gasolina() {
        return max_gasolina;
    }
    
    /** 
     * @param max_gasolina
     */
    public void setMax_gasolina(float max_gasolina) {
        this.max_gasolina = max_gasolina;
    }
    
    /** 
     * @return float
     */
    public float getGasolina() {
        return gasolina;
    }
    
    /** 
     * @param gasolina
     */
    public void setGasolina(float gasolina) {
        this.gasolina = gasolina;
    }
    
    /** 
     * @return boolean
     */
    public boolean isLigado() {
        return ligado;
    }
    
    /** 
     * @param ligado
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    /** 
     * @return Revendedor
     */
    public Revendedor getRevendedor() {
        return revendedor;
    }
    
    /** 
     * @param revendedor
     */
    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }
    
    /** 
     * @return float
     */
    public float getValorDiaria() {
        return valorDiaria;
    }
    
    /** 
     * @param valorDiaria
     */
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    /** 
     * @return int
     */
    public int getPassageiro() {
        return passageiro;
    }
    
    /** 
     * @param passageiro
     */
    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    
}
