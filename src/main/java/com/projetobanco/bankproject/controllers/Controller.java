package com.projetobanco.bankproject.controllers;

import com.projetobanco.bankproject.business.AccountBusiness;
import com.projetobanco.bankproject.entitys.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/bankindex")
public class Controller {

    private final String NOT_FOUND_ACCOUNT = "Não foi possivel encontrar";
    private final String INVALID_VALUE = "Valor invalido! Escolha entre 1 ou 0";

    @Autowired
    private AccountBusiness accountBusiness;



    @GetMapping(path="/showall")
    public  List<ContaBancaria> getAllUsers() {
        return accountBusiness.findAll();
    }

    @GetMapping(path = "/accountid/{id}")
    public ResponseEntity<ContaBancaria> getAccountById(@PathVariable int id){
        Optional<ContaBancaria> contasBancarias = accountBusiness.findById(id);

        if(!contasBancarias.isPresent()){
            return new ResponseEntity(NOT_FOUND_ACCOUNT, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(contasBancarias.toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/accountname/{nome}")
    public ResponseEntity<ContaBancaria> getAccountByName(@PathVariable String nome){
        List<ContaBancaria> contasBancarias = accountBusiness.findByName(nome);

        if(contasBancarias.isEmpty()){
            return new ResponseEntity(NOT_FOUND_ACCOUNT, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(contasBancarias.toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/accountagency/{agencia}")
    public ResponseEntity<ContaBancaria> getAccountByAgency(@PathVariable int agencia) {
        List<ContaBancaria> contasBancarias = accountBusiness.findByAgency(agencia);

        if(contasBancarias.isEmpty()){
            return new ResponseEntity(NOT_FOUND_ACCOUNT, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(contasBancarias.toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/contachequeliberado/{value}")
    public ResponseEntity<ContaBancaria> getAccountByOverdraft(@PathVariable int value) {
        List<ContaBancaria> contasBancarias = accountBusiness.findByOverdraft(value);

        if (value==0 || value==1) {
            return new ResponseEntity(contasBancarias.toString(), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity(INVALID_VALUE,HttpStatus.BAD_REQUEST);
    }
}
