package com.projetobanco.bankproject.service;

import com.projetobanco.bankproject.entitys.ContaBancaria;
import com.projetobanco.bankproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImp {

    @Autowired
    AccountRepository accountRepository;

    public List<ContaBancaria> findByName(String nome){
        return accountRepository.findByName(nome);
    }

    public List<ContaBancaria> findByAgency(int agencia){
        return accountRepository.findByAgency(agencia);
    }

    public List<ContaBancaria> findByOverdraft(int cheque){
        return accountRepository.FindByOverdraft(cheque);
    }

}
