package com.projetobanco.bankproject.repository;

import com.projetobanco.bankproject.entitys.ContaBancaria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<ContaBancaria,Integer> {


    @Query("select cb from ContaBancaria cb where cb.nomeUsuario like %?1%")
    public List<ContaBancaria> findByName(String nome);

    @Query("select cb from ContasBancarias cb where cb.agenciaUsuario like ?1")
    public List<ContaBancaria> findByAgency(int agencia);

    @Query("select cb from ContasBancarias cb where cb.chequeEspecialLiberado like ?1")
    public List<ContaBancaria> FindByOverdraft(int cheque);
}
