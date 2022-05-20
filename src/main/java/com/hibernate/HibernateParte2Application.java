package com.hibernate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.modelo.Alumno;
import com.hibernate.modelo.Curso;
import com.hibernate.servicio.IAlumnoServicio;
import com.hibernate.servicio.ICursoServicio;

@SpringBootApplication
public class HibernateParte2Application implements CommandLineRunner{

	@Autowired
	ICursoServicio sc;
	
	@Autowired
	IAlumnoServicio sa;
	
	Alumno a;
	
	Curso c,c1;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateParte2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		insertar();
		//leer();
	}
	
	
	public void insertar() {
		List<Curso> cursos = new ArrayList<>();
		
		a = new Alumno("Maria",LocalDate.of(1998, 11, 10));
		c = new Curso("Java SpringBoot", 300);
		c1 = new Curso("Python - Django", 400);
		
		cursos.add(c);
		cursos.add(c1);
		
		try {
			sc.guardar(c);
			sc.guardar(c1);
			sa.registrarTransaccional(a, cursos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void leer() {
		System.out.println(sa.leer(1).toString());	
	}

}
