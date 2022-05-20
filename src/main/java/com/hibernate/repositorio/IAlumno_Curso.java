package com.hibernate.repositorio;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hibernate.modelo.CursosAlumnos;

public interface IAlumno_Curso extends IGenericRepo<CursosAlumnos, Integer>{

	//Forma para hace una Query Transaccional, con el fin de insertar en la tabla que tiene primary key compuesta
	@Modifying
	@Query(value = "INSERT INTO cursos_alumnos(id_alumno,id_curso) VALUES (:idAlumno,:idCurso)", nativeQuery = true)
	Integer registrar(@Param("idAlumno") Integer idAlumno, @Param("idCurso") Integer idCurso);
	
}
