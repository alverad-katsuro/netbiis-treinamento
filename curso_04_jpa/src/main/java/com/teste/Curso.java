package com.teste;
// Generated 25 de nov. de 2022 01:10:00 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "Curso")
public class Curso implements java.io.Serializable {

	private Integer cursoId;
	private String cursoNome;
	private String cursoDescricao;
	private Double cursoValor;
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Curso() {
	}

	public Curso(String cursoNome, String cursoDescricao, Double cursoValor, Set<Pedido> pedidos) {
		this.cursoNome = cursoNome;
		this.cursoDescricao = cursoDescricao;
		this.cursoValor = cursoValor;
		this.pedidos = pedidos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "curso_id", unique = true, nullable = false)
	public Integer getCursoId() {
		return this.cursoId;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
	}

	@Column(name = "curso_nome", length = 40)
	public String getCursoNome() {
		return this.cursoNome;
	}

	public void setCursoNome(String cursoNome) {
		this.cursoNome = cursoNome;
	}

	@Column(name = "curso_descricao", length = 80)
	public String getCursoDescricao() {
		return this.cursoDescricao;
	}

	public void setCursoDescricao(String cursoDescricao) {
		this.cursoDescricao = cursoDescricao;
	}

	@Column(name = "curso_valor", precision = 30)
	public Double getCursoValor() {
		return this.cursoValor;
	}

	public void setCursoValor(Double cursoValor) {
		this.cursoValor = cursoValor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}