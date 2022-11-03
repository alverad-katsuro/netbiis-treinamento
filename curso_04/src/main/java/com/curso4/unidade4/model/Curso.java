package com.curso4.unidade4.model;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

	private Integer cursoId;
	private String cursoNome;
	private String cursoDescricao;
	private Double cursoValor;
	private String cursoUrl;
	private Set<Cliente> clienteHasCursos = new HashSet<>(0);

	public Curso() {
	}

	public Curso(String cursoNome, String cursoDescricao, Double cursoValor, String cursoUrl, Set<Cliente> clienteHasCursos) {
		this.cursoNome = cursoNome;
		this.cursoDescricao = cursoDescricao;
		this.cursoValor = cursoValor;
		this.cursoUrl = cursoUrl;
		this.clienteHasCursos = clienteHasCursos;
	}

    public Curso(String cursoNome, String cursoDescricao, Double cursoValor, String cursoUrl) {
		this.cursoNome = cursoNome;
		this.cursoDescricao = cursoDescricao;
		this.cursoValor = cursoValor;
		this.cursoUrl = cursoUrl;
	}

	public Integer getCursoId() {
		return this.cursoId;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
	}

	public String getCursoNome() {
		return this.cursoNome;
	}

	public void setCursoNome(String cursoNome) {
		this.cursoNome = cursoNome;
	}

	public String getCursoDescricao() {
		return this.cursoDescricao;
	}

	public void setCursoDescricao(String cursoDescricao) {
		this.cursoDescricao = cursoDescricao;
	}

	public Double getCursoValor() {
		return this.cursoValor;
	}

	public void setCursoValor(Double cursoValor) {
		this.cursoValor = cursoValor;
	}

	public String getCursoUrl() {
		return this.cursoUrl;
	}

	public void setCursoUrl(String cursoUrl) {
		this.cursoUrl = cursoUrl;
	}

	public Set<Cliente> getClienteHasCursos() {
		return this.clienteHasCursos;
	}

	public void setClienteHasCursos(Set<Cliente> clienteHasCursos) {
		this.clienteHasCursos = clienteHasCursos;
	}

    @Override
    public String toString() {
        return "Curso [cursoId=" + cursoId + ", cursoNome=" + cursoNome + ", cursoDescricao=" + cursoDescricao
                + ", cursoValor=" + cursoValor + ", cursoUrl=" + cursoUrl + "]";
    }

}
