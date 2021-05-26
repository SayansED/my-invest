package br.com.eduardo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
