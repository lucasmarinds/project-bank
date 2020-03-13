package com.projetobanco.bankproject.business;

import com.projetobanco.bankproject.entitys.ContaBancaria;
import com.projetobanco.bankproject.service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountBusiness {

    @Autowired
    AccountServiceImp accountServiceImp;

    public List<ContaBancaria> findByName(String nome){
        return accountServiceImp.findByName(nome);
    }

    public List<ContaBancaria> findByAgency(int agencia){
        return accountServiceImp.findByAgency(agencia);
    }

    public List<ContaBancaria> findByOverdraft(int cheque){
        return accountServiceImp.findByOverdraft(cheque);
    }

}
