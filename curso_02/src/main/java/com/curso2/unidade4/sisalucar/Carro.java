package com.curso2.unidade4.sisalucar;

public class Carro extends Veiculo {
    private static int idAllCarro = 0;
    private int idCarro;
    private boolean portaAberta = false;
    
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
     * @param idAllCarro
     */
    public static void setIdAllCarro(int idAllCarro) {
        Carro.idAllCarro = idAllCarro;
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
     * @return int
     */
    public int getPassageiro(){
        return 4;
    }

    public void abrePorta(){
       this.portaAberta = true; 
    }

    public void fechaPorta(){
        this.portaAberta = false; 
    }

    
    /** 
     * @return boolean
     */
    public boolean isPortaAberta() {
        return portaAberta;
    }

    
    /** 
     * @param gasolinhaLitros
     */
    public void abastace(float gasolinhaLitros){
        if (getGasolina() + gasolinhaLitros > getMax_gasolina()) {
            setGasolina(getMax_gasolina());
        } else {
            setGasolina(getGasolina() + gasolinhaLitros);
        }
    }

    
    /** 
     * @param velocidade
     */
    @Override
    public void acelera(int velocidade) {
        setVelocidade(getVelocidade() + velocidade);
    }

}
