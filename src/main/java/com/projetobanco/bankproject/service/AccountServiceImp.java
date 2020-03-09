package com.projetobanco.bankproject.service;

import com.projetobanco.bankproject.entitys.ContasBancarias;
import com.projetobanco.bankproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImp {

    @Autowired
    AccountRepository accountRepository;

    public List<ContasBancarias> findAll(){
        return (List<ContasBancarias>) accountRepository.findAll();
    }

    public Optional<ContasBancarias> findById(int id){
        return accountRepository.findById(id);
    }

    public List<ContasBancarias> findByName(String nome){
        return accountRepository.findByName(nome);
    }

    public List<ContasBancarias> findByAgency(int agencia){
        return accountRepository.findByAgency(agencia);
    }

    public List<ContasBancarias> findByOverdraft(int cheque){
        return accountRepository.FindByOverdraft(cheque);
    }

}
