package com.example.citi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.citi.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	 List<Curso> findByNombreContaining(String nombre);
	    
	    void deleteByNombre(String nombre);
	    
	    Curso save(Curso curso);
}
