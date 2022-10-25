package com.curso3.desafio.persistencia;

import com.curso3.unidade1.rh.Administrador;
import com.curso3.unidade1.rh.Colacao;
import com.curso3.unidade1.rh.Diretor;
import com.curso3.unidade1.rh.Funcionario;

public class PersistenciaApp {
    public static void main(String[] args) {
        GenericDAO<Funcionario> funcionario = new GenericDAO<Funcionario>();

        Administrador adm = new Administrador("ADM", Colacao.DOUTORADO);
        Diretor diretor = new Diretor("Diretor", Colacao.DOUTORADO);

        funcionario.create(adm);
        funcionario.create(diretor);
    }
}
