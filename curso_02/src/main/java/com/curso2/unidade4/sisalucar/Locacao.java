package com.curso2.unidade4.sisalucar;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Locacao {
    static int IdAllLocacao = 0;
    static ArrayList<Locacao> LocacaoList = new ArrayList<Locacao>();
    private int IdLocacao;
    private int IdCliente;
    private int IdCarro;
    private float valorLocado;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFim;
  

    public Locacao(int idCliente, int idCarro, float valorLocado, LocalDate dataInicio, LocalDate dataFim) {
        this.IdLocacao = Locacao.getIdAllLocacao();
        Locacao.setIdAllLocacao(getIdLocacao() + 1); 
        this.IdCliente = idCliente;
        this.IdCarro = idCarro;
        this.valorLocado = valorLocado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Locacao(int idCliente, int idCarro, float valorLocado, LocalDate dataFim) {
        this.IdLocacao = Locacao.getIdAllLocacao();
        Locacao.setIdAllLocacao(getIdLocacao() + 1); 
        this.IdCliente = idCliente;
        this.IdCarro = idCarro;
        this.valorLocado = valorLocado;
        this.dataFim = dataFim;
    }

    
    /** 
     * @param IdCliente
     * @param IdCarro
     * @param valorLocado
     * @param dataInicio
     * @param dataFim
     */
    public static void realizarLocacao(int IdCliente, int IdCarro, float valorLocado, String dataInicio, String dataFim){
        Locacao nova = new Locacao(IdCliente, IdCarro, valorLocado, LocalDate.parse(dataInicio), LocalDate.parse(dataFim));
        Locacao.getLocacaoList().add(nova);
    }

    
    /** 
     * @param IdCliente
     * @param IdCarro
     * @param valorLocado
     * @param dataFim
     */
    public static void realizarLocacao(int IdCliente, int IdCarro, float valorLocado, String dataFim){
        Locacao nova = new Locacao(IdCliente, IdCarro, valorLocado, LocalDate.parse(dataFim));
        Locacao.getLocacaoList().add(nova);
    }

    
    /** 
     * @param ...date
     */
    public static void gerarRelatorio(String ...date){
        if (date.length == 1) {
            gerarRelatorio(LocalDate.parse(date[0]));
        } else {
            gerarRelatorio(LocalDate.parse(date[0]), LocalDate.parse(date[1]));
        }
    }

    
    /** 
     * @param ...date
     */
    public static void gerarRelatorio(LocalDate ...date){
        float lucro = 0;
        int carrosLocados = 0;


        if (date.length == 1) {
            for (Locacao locacao : getLocacaoList()) {
                if (locacao.getDataInicio().compareTo(date[0]) >= 0) {
                    carrosLocados++;
                    lucro += locacao.getValorLocado();
                }
            }            
            JOptionPane.showMessageDialog(null, "A partir da data " + date[0] + "\nLucro esperado: R$" + lucro + "\nCarros Locados: " + carrosLocados + "\n");
        } else {
            for (Locacao locacao : getLocacaoList()) {
                if (locacao.getDataInicio().compareTo(date[0]) >= 0 && locacao.getDataFim().compareTo(date[1]) <= 0) {
                    carrosLocados++;
                    lucro += locacao.getValorLocado();
                }
            }
            JOptionPane.showMessageDialog(null, "No periodo de " + date[0] + " ate " + date[1] + "\nLucro esperado: R$" + lucro + "\nCarros Locados: " + carrosLocados + "\n");
        }

    }

    
    /** 
     * @param locacaoList
     */
    public static void setLocacaoList(ArrayList<Locacao> locacaoList) {
        LocacaoList = locacaoList;
    }

    
    /** 
     * @return int
     */
    public int getIdCarro() {
        return IdCarro;
    }

    
    /** 
     * @return ArrayList<Locacao>
     */
    public static ArrayList<Locacao> getLocacaoList(){
        return Locacao.LocacaoList;
    }

    
    /** 
     * @return int
     */
    public static int getIdAllLocacao() {
        return Locacao.IdAllLocacao;
    }

    
    /** 
     * @param idAllLocacao
     */
    public static void setIdAllLocacao(int idAllLocacao) {
        IdAllLocacao = idAllLocacao;
    }
    
    /** 
     * @return int
     */
    public int getIdLocacao() {
        return IdLocacao;
    }
    
    /** 
     * @param idLocacao
     */
    public void setIdLocacao(int idLocacao) {
        IdLocacao = idLocacao;
    }
    
    /** 
     * @return int
     */
    public int getIdCliente() {
        return IdCliente;
    }
    
    /** 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }
    
    /** 
     * @return float
     */
    public float getValorLocado() {
        return valorLocado;
    }
    
    /** 
     * @param valorLocado
     */
    public void setValorLocado(float valorLocado) {
        this.valorLocado = valorLocado;
    }
    
    /** 
     * @return LocalDate
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    
    /** 
     * @param dataInicio
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    /** 
     * @return LocalDate
     */
    public LocalDate getDataFim() {
        return dataFim;
    }
    
    /** 
     * @param dataFim
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    
}
