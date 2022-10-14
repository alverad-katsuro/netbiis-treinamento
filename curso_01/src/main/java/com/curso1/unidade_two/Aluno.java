/*
Unidade 2 - pag 99
Questão 4
DECLARACAO DE VARIAVEL:
    caracter matricula
    caracter nome
    caracter endereco
    real nota
    logico sexo

INICIO

saldo_bancario << 188.0;
numero_irmaos << 7; 
texto_prova << 'Ao amanhecer o galo cacarejou';
porta << 'aberta';

*/


package com.curso1.unidade_two;

import javax.swing.JOptionPane;

public class Aluno {
    private String matricula;
    private String nome;
    private String endereco;
    private float nota[] = new float[4];
    private Sexo sexo;
    private String telefone;
    private float frequencia;

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
        String matricula = JOptionPane.showInputDialog("Digite a Matricula");
        String endereco = JOptionPane.showInputDialog("Digite o Endereço");
        float nota[] = new float[4];
        for (int i = 0; i < 4; i++) {
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno"));
        }
        Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, "Selecione o sexo do aluno", "Input", JOptionPane.INFORMATION_MESSAGE, null, Sexo.values(), Sexo.valueOf("MASCULINO"));
        Aluno aluno = new Aluno(matricula, nome, endereco, nota, sexo);
        JOptionPane.showMessageDialog(null, "Informações:\n Aluno: "+ aluno.getNome()+"\n Matricula: "+aluno.getMatricula()+"\n Endereço: "+aluno.getEndereco()+"\n Sexo: "+ aluno.getSexo()+"\n Nota: "+aluno.getNota());
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Aluno [endereco=" + endereco + ", matricula=" + matricula + ", nome=" + nome + ", nota=" + nota
                + ", sexo=" + sexo + "]";
    }

    public Aluno(String matricula, String nome, String endereco, float nota[], Sexo sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.nota = nota;
        this.sexo = sexo;
    }

    public Aluno(){}

    public static void mediaAluno(){
        float notas = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite o valor da %dº nota: ", i + 1);
            notas += Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da "+ i + "º nota."));
        }
        JOptionPane.showMessageDialog(null, "A média das notas é: " + (notas / 4.0));
    }

    
    /** 
     * @return boolean
     */
    public final boolean passou(){
        float media = getMedia();
        if (media >= 7.0f && frequencia >= 75.0f){
            return true;
        } else {
            return false;
        }

    }

    
    /** 
     * @return float
     */
    public final float getMedia(){
        float notas = 0;
        for (int i = 0; i < nota.length; i++) {
            notas += nota[i];            
        }
        return notas / 4f;
    }

    
    /** 
     * @return String
     */
    public String getMatricula() {
        return matricula;
    }
    
    /** 
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMatricula(){
        this.matricula = JOptionPane.showInputDialog(null, "Digite o Matricula");
    }
    
    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }

    
    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNome(){
        this.nome = JOptionPane.showInputDialog("Digite o Nome");
    }

    
    /** 
     * @param frequencia
     */
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public void setFrequencia() {
        this.frequencia = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a frequencia"));
    }

    
    /** 
     * @return float
     */
    public float getFrequencia() {
        return frequencia;
    }

    
    /** 
     * @return String
     */
    public String getEndereco() {
        return endereco;
    }
    
    /** 
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setEndereco(){
        this.endereco = JOptionPane.showInputDialog(null, "Digite o Endereço");
    }
    
    /** 
     * @return float[]
     */
    public float[] getNota() {
        return nota;
    }
    
    /** 
     * @param nota[]
     */
    public void setNota(float nota[]) {
        this.nota = nota;
    }
    public void setNota(){
        for (int i = 0; i < nota.length; i++) {
            this.nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Nota " + (i + 1)));
        }
    }
    
    /** 
     * @return Sexo
     */
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo() {
        this.sexo = (Sexo) JOptionPane.showInputDialog(null, "Selecione o sexo do aluno", "Sexo Seleção", JOptionPane.QUESTION_MESSAGE, null, Sexo.values(), Sexo.MASCULINO);
    }
    
    /** 
     * @param sexo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    /** 
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setTelefone(){
        this.telefone = JOptionPane.showInputDialog(null, "Digite o Telefone");
    }
    
    /** 
     * @return String
     */
    public String getTelefone() {
        return telefone;
    }

    
}
