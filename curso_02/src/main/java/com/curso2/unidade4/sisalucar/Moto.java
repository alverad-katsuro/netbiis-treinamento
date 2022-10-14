package com.curso2.unidade4.sisalucar;

public class Moto extends Veiculo {
    private static int idAllMoto = 0;
    private int idMoto; 
    
    public Moto(){
        this.idMoto = getIdAllMoto();
        Moto.incIdAllMoto();        
    }

    public Moto(String modelo, String cor, String fabricante, String motor, int ano, float valorDiaria, String placa, Revendedor revendedor){
        this.idMoto = getIdAllMoto();
        Moto.incIdAllMoto();
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
     * @param idAllMoto
     */
    public static void setIdAllMoto(int idAllMoto) {
        Moto.idAllMoto = idAllMoto;
    }
    
    /** 
     * @return int
     */
    public static int getIdAllMoto() {
        return idAllMoto;
    }
    public static void incIdAllMoto() {
        Moto.idAllMoto = Moto.idAllMoto++;
    }

    
    /** 
     * @return int
     */
    public int getIdMoto() {
        return idMoto;
    }

    
    /** 
     * @param idMoto
     */
    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }
    
    
    /** 
     * @return int
     */
    public int getPassageiro(){
        return 2;
    }

    
    /** 
     * @param velocidade
     */
    @Override
    public void acelera(int velocidade) {
        setVelocidade(getVelocidade() + velocidade);
    }
}
