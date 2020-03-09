package com.projetobanco.bankproject.repository;

import com.projetobanco.bankproject.entitys.ContasBancarias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<ContasBancarias,Integer> {


    @Query("select cb from ContasBancarias cb where cb.nome_usuario like %?1%")
    public List<ContasBancarias> findByName(String nome);

    @Query("select cb from ContasBancarias cb where cb.agencia_usuario like ?1")
    public List<ContasBancarias> findByAgency(int agencia);

    @Query("select cb from ContasBancarias cb where cb.cheque_especial_liberado like ?1")
    public List<ContasBancarias> FindByOverdraft(int cheque);
}
