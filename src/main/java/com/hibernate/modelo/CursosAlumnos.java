package com.hibernate.modelo;

import javax.persistence.*;

@Entity
@Table(name="cursos_alumnos")
@IdClass(AlumnosCursosFK.class)
public class CursosAlumnos {

	@Id
	private Alumno alumno;
	
	@Id
	private Curso curso;
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public CursosAlumnos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CursosAlumnos [alumno=" + alumno + ", curso=" + curso + "]";
	}
	
	
	
	
}
