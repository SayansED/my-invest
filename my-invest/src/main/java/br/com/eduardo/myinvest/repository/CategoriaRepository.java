package br.com.eduardo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
