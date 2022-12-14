package com.curso4.unidade4.model;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	private Integer clienteId;
	private String clienteNome;
	private String clienteSobrenome;
	private String clienteEmail;
	private String clienteTelefone;
	private String clienteCpf;
	private Set<Curso> clienteHasCursos = new HashSet<>(0);

	public Cliente() {
	}

	public Cliente(String clienteNome, String clienteSobrenome, String clienteEmail, String clienteTelefone,
			String clienteCpf, Set<Curso> clienteHasCursos) {
		this.clienteNome = clienteNome;
		this.clienteSobrenome = clienteSobrenome;
		this.clienteEmail = clienteEmail;
		this.clienteTelefone = clienteTelefone;
		this.clienteCpf = clienteCpf;
		this.clienteHasCursos = clienteHasCursos;
	}
    public Cliente(String clienteNome, String clienteSobrenome, String clienteEmail, String clienteTelefone,
			String clienteCpf) {
		this.clienteNome = clienteNome;
		this.clienteSobrenome = clienteSobrenome;
		this.clienteEmail = clienteEmail;
		this.clienteTelefone = clienteTelefone;
		this.clienteCpf = clienteCpf;
	}

	public Integer getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getClienteNome() {
		return this.clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteSobrenome() {
		return this.clienteSobrenome;
	}

	public void setClienteSobrenome(String clienteSobrenome) {
		this.clienteSobrenome = clienteSobrenome;
	}

	public String getClienteEmail() {
		return this.clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	public String getClienteTelefone() {
		return this.clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public String getClienteCpf() {
		return this.clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	public Set<Curso> getClienteHasCursos() {
		return this.clienteHasCursos;
	}

	public void setClienteHasCursos(Set<Curso> clienteHasCursos) {
		this.clienteHasCursos = clienteHasCursos;
	}

    @Override
    public String toString() {
        return "Cliente [clienteId=" + clienteId + ", clienteNome=" + clienteNome + ", clienteSobrenome="
                + clienteSobrenome + ", clienteEmail=" + clienteEmail + ", clienteTelefone=" + clienteTelefone
                + ", clienteCpf=" + clienteCpf + "]";
    }

}
