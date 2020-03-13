package com.projetobanco.bankproject.controllers;

import com.projetobanco.bankproject.VO.ContaBancariaVO;
import com.projetobanco.bankproject.business.AccountBusiness;
import com.projetobanco.bankproject.entitys.ContaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/bankindex")
public class Controller {

    private final String NOT_FOUND_ACCOUNT = "Não foi possivel encontrar";
    private final String INVALID_VALUE = "Valor invalido! Escolha entre 1 ou 0";

    @Autowired
    private AccountBusiness accountBusiness;

    private ContaBancariaVO contaBancariaVO;

    @GetMapping(path = "/accountname/{nome}")
    public ResponseEntity<ContaBancariaVO> getAccountByName(@PathVariable String nome){
        List<ContaBancaria> contas = accountBusiness.findByName(nome);
        List<ContaBancariaVO> contasVO = contas.stream().map(conta -> new ContaBancariaVO(conta)).collect(Collectors.toList());
        if(contasVO.isEmpty()){
            return new ResponseEntity(NOT_FOUND_ACCOUNT, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(contasVO.toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/accountagency/{agencia}")
    public ResponseEntity<ContaBancariaVO> getAccountByAgency(@PathVariable int agencia) {
        List<ContaBancaria> contas = accountBusiness.findByAgency(agencia);
        List<ContaBancariaVO> contasVO = contas.stream().map(conta -> new ContaBancariaVO(conta)).collect(Collectors.toList());
        if(contasVO.isEmpty()){
            return new ResponseEntity(NOT_FOUND_ACCOUNT, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(contasVO.toString(), HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/contachequeliberado/{value}")
    public ResponseEntity<ContaBancariaVO> getAccountByOverdraft(@PathVariable int value) {
        List<ContaBancaria> contas = accountBusiness.findByOverdraft(value);
        List<ContaBancariaVO> contasVO = contas.stream().map(conta -> new ContaBancariaVO(conta)).collect(Collectors.toList());
        if(!contasVO.isEmpty()){
            return new ResponseEntity(contasVO.toString(), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity(INVALID_VALUE,HttpStatus.BAD_REQUEST);
    }
}
