package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Paciente;


public interface SPaciente {
	Paciente create(Paciente paciente);
	List<Paciente> readAll();
	Paciente read(Long id);
	void delete(Long id);
	Paciente update(Paciente pa);
}
