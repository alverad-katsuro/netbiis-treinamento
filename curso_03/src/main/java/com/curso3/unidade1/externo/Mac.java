package com.curso3.unidade1.externo;

import static com.curso3.unidade1.rh.Universidade.*;

import java.util.ArrayList;

import com.curso3.unidade1.rh.Administrador;
import com.curso3.unidade1.rh.Colacao;
import com.curso3.unidade1.rh.Diretor;
import com.curso3.unidade1.rh.Funcionario;
import com.curso3.unidade1.rh.Professor;
import com.curso3.unidade1.rh.Universidade;

public class Mac {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        universidade.addFuncionario(new Diretor("Alguem", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem2", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem9", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem10", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem10", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem10", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem10", Colacao.DOUTORADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem3", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem4", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem5", Colacao.MESTRADO));
        universidade.addFuncionario(new Professor("Alguem6", Colacao.GRADUACAO));
        universidade.addFuncionario(new Professor("Alguem7", Colacao.GRADUACAO));
        universidade.addFuncionario(new Administrador("Alguem8", Colacao.GRADUACAO));

        gerarRelatorioProfessoresMestresDoutores(universidade.getFuncionarios());

        Mac.avaliarEnsino(universidade);
    }

    
    /** 
     * @param universidade
     */
    public static void avaliarEnsino(Universidade universidade){
        ArrayList<Funcionario> funcionarios = universidade.getFuncionarios();
        int graduacao = 0;
        int mestres = 0;
        int doutores = 0;
        for (Funcionario funcionario : funcionarios) {
            switch (funcionario.getColacao()) {
                case MESTRADO -> mestres++;
                case DOUTORADO -> doutores++;
                case GRADUACAO -> graduacao++;
            }
        }
        float conceito = (doutores * 0.4f) + (mestres * 0.3f) + (graduacao * 0.1f);
        if (conceito >= 5) {
            System.out.println("Nota 5");
        } else if (conceito > 3 ) {
            System.out.println("Nota 4");
        } else {
            System.out.println("Nota 2");
        }

    }
}
