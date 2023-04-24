package me.dio.academia.digital.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;


@RestController
@RequestMapping("/alunos")
public class AlunoController{
	
	@Autowired
	private AlunoServiceImpl service;

	@GetMapping
	public List<Aluno> getAll() {
		return service.getAll();
	}
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAvaliacao(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaId(id);
	}
	
	@DeleteMapping
	public void delete(@RequestParam(value = "id", required = true ) Long id) {
		service.delete(id);
	}
	
	@PatchMapping
	public Aluno update(@RequestParam(value = "id", required = true) Long id, @RequestBody AlunoUpdateForm formUpdate) {
		return service.update(id, formUpdate);
	}
	
	
}
