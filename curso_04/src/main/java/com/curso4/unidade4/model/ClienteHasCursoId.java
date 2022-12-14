package com.curso4.unidade4.model;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

/**
 * ClienteHasCursoId generated by hbm2java
 */
public class ClienteHasCursoId implements java.io.Serializable {

	private int clienteId;
	private int cursoId;

	public ClienteHasCursoId() {
	}

	public ClienteHasCursoId(int clienteId, int cursoId) {
		this.clienteId = clienteId;
		this.cursoId = cursoId;
	}

	public int getClienteId() {
		return this.clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getCursoId() {
		return this.cursoId;
	}

	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClienteHasCursoId))
			return false;
		ClienteHasCursoId castOther = (ClienteHasCursoId) other;

		return (this.getClienteId() == castOther.getClienteId()) && (this.getCursoId() == castOther.getCursoId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getClienteId();
		result = 37 * result + this.getCursoId();
		return result;
	}

}
