package com.curso4.unidade5.model;
// Generated 7 de nov. de 2022 23:22:36 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "Cliente", catalog = "lojavirtual")
public class Cliente implements java.io.Serializable {

	private Integer clienteId;
	private String clienteNome;
	private String clienteSobrenome;
	private String clienteEmail;
	private String clienteTelefone;
	private String clienteCpf;

	public Cliente() {
	}

	public Cliente(String clienteNome, String clienteSobrenome,
			String clienteEmail, String clienteTelefone, String clienteCpf) {
		this.clienteNome = clienteNome;
		this.clienteSobrenome = clienteSobrenome;
		this.clienteEmail = clienteEmail;
		this.clienteTelefone = clienteTelefone;
		this.clienteCpf = clienteCpf;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cliente_id", unique = true, nullable = false)
	public Integer getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	@Column(name = "cliente_nome", nullable = false, length = 20)
	public String getClienteNome() {
		return this.clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	@Column(name = "cliente_sobrenome", nullable = false, length = 40)
	public String getClienteSobrenome() {
		return this.clienteSobrenome;
	}

	public void setClienteSobrenome(String clienteSobrenome) {
		this.clienteSobrenome = clienteSobrenome;
	}

	@Column(name = "cliente_email", nullable = false, length = 30)
	public String getClienteEmail() {
		return this.clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	@Column(name = "cliente_telefone", nullable = false, length = 16)
	public String getClienteTelefone() {
		return this.clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	@Column(name = "cliente_cpf", nullable = false, length = 14)
	public String getClienteCpf() {
		return this.clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

}
