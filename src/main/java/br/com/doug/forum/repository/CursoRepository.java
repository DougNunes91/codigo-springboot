package br.com.doug.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
