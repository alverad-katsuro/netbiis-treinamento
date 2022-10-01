package com.netbiis.desafio_final.desafio_04;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;

import com.netbiis.unidade_two.Aluno;

/*
 Para rodar este codigo, é necessario ter o pacote unidade_two e a classe Aluno,
 não adianta baixar so a pasta de desafios.
 */


public class Parte_dois {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunoList = new ArrayList<Aluno>();
        for (int i = 0; i < 4; i++) {
            Aluno aluno = new Aluno();
            aluno.setNome();
            aluno.setFrequencia();
            aluno.setNota();
            alunoList.add(aluno);
        }
        FileWriter aprovados_f = new FileWriter("aprovados.csv");
		PrintWriter aprovado = new PrintWriter(aprovados_f);
        FileWriter reprovados_f = new FileWriter("reprovados.csv");
		PrintWriter reprovados = new PrintWriter(reprovados_f);
		aprovado.println("Nome,Média,Frequencia,Situacao");
		reprovados.println("Nome,Média,Frequencia,Situacao");
        for (Aluno aluno : alunoList) {
            if (aluno.passou()){
                aprovado.printf(Locale.US, "%s,%.2f,%.2f,Aprovado\n", aluno.getNome(), aluno.getMedia(), aluno.getFrequencia());
            } else {
                reprovados.printf(Locale.US,"%s,%.2f,%.2f,Reprovado\n", aluno.getNome(), aluno.getMedia(), aluno.getFrequencia());
            }
        }
        aprovados_f.close();
        aprovado.close();
        reprovados_f.close();
        reprovados.close();
    }
}
