package com.hibernate.modelo;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="alumnos")
public class Alumno {
//Te estoy hackeando maria muahahahaha
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	private LocalDate fNacimiento;

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer idAlumno, String nombre, LocalDate fNacimiento) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fNacimiento = fNacimiento;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	
	

	public Alumno(String nombre, LocalDate fNacimiento) {
		super();
		this.nombre = nombre;
		this.fNacimiento = fNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", fNacimiento=" + fNacimiento + "]";
	}
	
	
}
