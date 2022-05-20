package com.hibernate.servicio;


import java.util.List;

import com.hibernate.modelo.*;

public interface IAlumnoServicio {
	
	Alumno leer(Integer id);
	Alumno guardar(Alumno a);
	Alumno registrarTransaccional(Alumno a, List<Curso> cursos) throws Exception;

}
