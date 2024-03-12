package br.com.sistemaescolar.genix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistemaescolar.genix.model.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {}
