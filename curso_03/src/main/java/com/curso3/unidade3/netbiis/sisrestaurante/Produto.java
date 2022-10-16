package com.curso3.unidade3.netbiis.sisrestaurante;
/**
* Classe com o restaurante de sushi
* @author Alfredo Gabriel
* @version 1.0
* @since 13/10/2022
*/
public sealed abstract class Produto permits Hall_Wassabi, Temaki_Especial, Promocao, Entrada {
    protected int quantidade = 1;
    protected String nome;
    protected float preco_final;

    
    
    /** 
     * Retorna a quantidade deste produto na sacola.
     * @return int - Quantidade de produtos.
     */
    public int getQuantidade() {
        return quantidade;
    }

    
    /** 
     * Define a quantidade deste produto na sacola.
     * @param quantidade - Quantidade de produtos.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /** 
     * Adiciona uma unidade deste produto da sacola.
     */
    public void maisUm(){
        this.quantidade = this.quantidade + 1;
    }

    
    /** 
     * Retira uma unidade deste produto da sacola.
     * @return boolean - Confirma a remoção de uma unidade.
     */
    public boolean menosUm(){
        if (this.quantidade > 0) {
            this.quantidade = this.quantidade - 1;
            return true;
        } else {
            return false;
        }
    }

    /** 
     * Lista todos os produtos instanciados.
     */
    public static void listarProduto(){
        Hall_Wassabi.listaWassabis();
        Temaki_Especial.listaTemaki();
        Promocao.listaPromocoes();
        Entrada.listarEntradas();
    }

    
    /** 
     * Retorna o nome do produto definido na sua criação.
     * @return String - Nome do produto.
     */
    public String getNome() {
        return nome;
    }

    
    /** 
     * Define o nome do produto.
     * @param nome - Nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /** 
     * Sobreescreve a forma de apresentar este objeto.
     * @return String - Objeto Comida.
     */
    @Override
    public String toString() {
        return "Produto [quantidade=" + quantidade + ", nome=" + nome + "]";
    }

    
    /** 
     * Busca um produto através do nome dado a ele.
     * @param nome - Nome do produto.
     * @return Produto - Produto caso tenha achado ou NULL.
     */
    public static Produto achaProduto(String nome){
        Produto produto;
        produto = Hall_Wassabi.getWassabi(nome);
        if (produto != null) {
            return produto;
        } else{
            produto = Entrada.getEntrada(nome);
            if (produto != null) {
                return produto;
            } else {
                produto = Promocao.getPromocao(nome);
                if (produto != null) {
                    return produto;
                } else {
                    produto = Temaki_Especial.getTemaki_Especial(nome);
                    if (produto != null) {
                        return produto;
                    } else {
                        System.out.println("Não encontrado");
                        return null;
                    }
                }
            }
        }
    }

    
    /** 
     * Recupera o preço final do produto.
     * @return float - Preço final calculado com quantidade * valor_comida.
     */
    public float getPreco_final() {
        return preco_final;
    }

    
    /** 
     * Define o preço final do produto.
     * @param preco_final - Define o preço final.
     */
    public void setPreco_final(float preco_final) {
        this.preco_final = preco_final;
    }
    
}
