package br.edu.escola.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.escola.negocio.Aluno;

@Repository
public interface IAlunoRepository extends CrudRepository<Aluno, Integer> {
}