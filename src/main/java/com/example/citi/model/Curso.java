package com.example.citi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private String nombre;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "horario")
    private String horario;

	public Curso(String nombre, int duracion, String horario) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.horario = horario;
	}
	
	public Curso() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
	

}
