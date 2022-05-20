package com.hibernate.modelo;

import javax.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	@Column(nullable=false)
	private Integer creditos;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Curso(Integer idCurso, String nombre, Integer creditos) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	

	public Curso(String nombre, Integer creditos) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombre=" + nombre + ", creditos=" + creditos + "]";
	}
	
	
	
	
	
}
