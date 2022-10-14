package com.curso2.unidade3;

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
     * @param idAllCarro
     */
    public static void setIdAllCarro(int idAllCarro) {
        Carro.idAllCarro = idAllCarro;
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
     * @return int
     */
    public static int getIdAllCarro() {
        return idAllCarro;
    }
    public static void incIdAllCarro() {
        Carro.idAllCarro = Carro.idAllCarro++;
    }
    
    /** 
     * @return int
     */
    public int getIdCarro() {
        return idCarro;
    }
    
    /** 
     * @param idCarro
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
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
    public void LigaDesliga(){
        this.ligado = !isLigado();
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
    
}
