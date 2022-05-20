package com.hibernate.servicioImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.modelo.Alumno;
import com.hibernate.modelo.Curso;
import com.hibernate.repositorio.IAlumno_Curso;
import com.hibernate.repositorio.ICurso;
import com.hibernate.servicio.ICursoServicio;

@Service
public class CursoServicioImpl implements ICursoServicio{

	@Autowired
	ICurso repo;
	
	@Autowired
	IAlumno_Curso crepo;
	
	@Override
	public Curso leer(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<Curso> c = repo.findById(id);
		return c.isPresent() ? c.get() : null;
	}

	@Override
	public Curso guardar(Curso c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}



}
