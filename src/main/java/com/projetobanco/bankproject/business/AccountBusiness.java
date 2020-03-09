package com.projetobanco.bankproject.business;

import com.projetobanco.bankproject.entitys.ContasBancarias;
import com.projetobanco.bankproject.service.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountBusiness {

    @Autowired
    AccountServiceImp accountServiceImp;

    public List<ContasBancarias> findAll(){
        return accountServiceImp.findAll();
    }

    public Optional<ContasBancarias> findById(int id){
        return accountServiceImp.findById(id);
    }

    public List<ContasBancarias> findByName(String nome){
        return accountServiceImp.findByName(nome);
    }

    public List<ContasBancarias> findByAgency(int agencia){
        return accountServiceImp.findByAgency(agencia);
    }

    public List<ContasBancarias> findByOverdraft(int cheque){
        return accountServiceImp.findByOverdraft(cheque);
    }

}
