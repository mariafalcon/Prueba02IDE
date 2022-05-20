package com.hibernate.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
@Embeddable
public class AlumnosCursosFK implements Serializable{

	private static final long serialVrsionUID=1L;
	
	@ManyToOne
	@JoinColumn(name="id_alumno", nullable=false, foreignKey = @ForeignKey(name="FK_alumnos_cursos"))
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name="id_curso", nullable=false, foreignKey = @ForeignKey(name="Fk_cursos_alumnos"))
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


	public AlumnosCursosFK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnosCursosFK(Alumno alumno, Curso curso) {
		super();
		this.alumno = alumno;
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "AlumnosCursosFK [alumno=" + alumno + ", curso=" + curso + "]";
	}
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(alumno, curso);
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        AlumnosCursosFK other = (AlumnosCursosFK) obj;
	        return Objects.equals(alumno, other.alumno) && Objects.equals(curso, other.curso);
	    }
	
}
