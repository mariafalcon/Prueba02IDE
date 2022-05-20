package com.hibernate.servicioImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.modelo.Alumno;
import com.hibernate.modelo.Curso;
import com.hibernate.repositorio.IAlumno;
import com.hibernate.repositorio.IAlumno_Curso;
import com.hibernate.servicio.IAlumnoServicio;
@Service
public class AlumnoServicioImpl implements IAlumnoServicio{

	@Autowired
	IAlumno repo;
	
	@Autowired
	IAlumno_Curso crepo;
	
	
	@Override
	public Alumno leer(Integer id) {
		// TODO Auto-generated method stub
		Optional<Alumno> a = repo.findById(id);
		
		return a.isPresent() ? a.get() : null;
	}

	@Override
	public Alumno guardar(Alumno a) {
		// TODO Auto-generated method stub
		return repo.save(a);
	}

	@Transactional
	@Override
	public Alumno registrarTransaccional(Alumno a, java.util.List<Curso> cursos) throws Exception {
		// TODO Auto-generated method stub
		
		repo.save(a);

		cursos.forEach(ex -> crepo.registrar(a.getIdAlumno(), ex.getIdCurso()));
		return a;
	}

}
