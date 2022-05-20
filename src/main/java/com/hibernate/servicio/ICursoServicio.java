package com.hibernate.servicio;


import java.util.List;

import com.hibernate.modelo.Alumno;
import com.hibernate.modelo.Curso;

public interface ICursoServicio {

	Curso leer(Integer id);
	Curso guardar(Curso c);
	
}
