package com.curso3.desafio.sisrestaurante;
/**
* Clientes do restaurante.
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/

public class Cliente {
    private String nome;
    private String CPF;
    private String telefone;
    private String endereco;
    private String num_cartao;

    
    public Cliente(String nome, String CPF, String telefone, String endereco, String num_cartao) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.num_cartao = num_cartao;
    }

    
    /** 
     * Recupera o Nome cadastrado.
     * @return String nome do cliente.
     */
    public String getNome() {
        return nome;
    }
    
    /** 
     * Define o Nome do cliente.
     * @param nome nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /** 
     * Recupera o CPF cadastrado.
     * @return String CPF do clietne.
     */
    public String getCPF() {
        return CPF;
    }
    
    /** 
     * Define o CPF do cliente.
     * @param cPF CPF do cliente.
     */
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    /** 
     * Recupera o Telefone cadastrado.
     * @return String - Telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }
    
    /** 
     * Define o Telefone do cliente.
     * @param telefone - Telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /** 
     * Recupera o Endereço cadastrado.
     * @return String - Endereço do Cliente.
     */
    public String getEndereco() {
        return endereco;
    }
    
    /** 
     * Define o Endereço do cliente.
     * @param endereco - Endereço do Cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /** 
     * Recupera o Nome cadastrado
     * @return String - Número do Cartão do Cliente.
     */
    public String getNum_cartao() {
        return num_cartao;
    }
    
    /** 
     * Define o número do cartão de credito do cliente.
     * @param num_cartao - Numpero do Cartão do Cliente.
     */
    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }
}
