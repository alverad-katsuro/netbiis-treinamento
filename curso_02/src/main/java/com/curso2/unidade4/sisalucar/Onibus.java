package com.curso2.unidade4.sisalucar;

public class Onibus extends Veiculo {
    private static int idAllOnibus = 0;
    private int idOnibus; 
    
    public Onibus(){
        this.idOnibus = getIdAllOnibus();
        Onibus.incIdAllOnibus();        
    }

    public Onibus(String modelo, String cor, String fabricante, String motor, int ano, float valorDiaria, String placa, Revendedor revendedor){
        this.idOnibus = getIdAllOnibus();
        Onibus.incIdAllOnibus();
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
     * @param idAllOnibus
     */
    public static void setIdAllOnibus(int idAllOnibus) {
        Onibus.idAllOnibus = idAllOnibus;
    }
    
    /** 
     * @return int
     */
    public static int getIdAllOnibus() {
        return idAllOnibus;
    }
    public static void incIdAllOnibus() {
        Onibus.idAllOnibus = Onibus.idAllOnibus++;
    }

    
    /** 
     * @return int
     */
    public int getIdOnibus() {
        return idOnibus;
    }

    
    /** 
     * @param idOnibus
     */
    public void setIdOnibus(int idOnibus) {
        this.idOnibus = idOnibus;
    }
    
    
    /** 
     * @return int
     */
    public int getPassageiro(){
        return 16;
    }

    
    /** 
     * @param velocidade
     */
    @Override
    public void acelera(int velocidade) {
        setVelocidade(getVelocidade() + velocidade);
    }
}
