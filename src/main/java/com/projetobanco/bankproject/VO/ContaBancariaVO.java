package com.projetobanco.bankproject.VO;

import com.projetobanco.bankproject.entitys.ContaBancaria;

public class ContaBancariaVO {

    private String nomeUsuario;
    private Integer numeroConta;
    private Integer agenciaUsuario;
    private String chequeEspecialLiberado;
    private String saldoUsuario;
    private String chequeEspecial;
    private String taxa;

    public ContaBancariaVO converterEntity(ContaBancaria contaBancaria){
        ContaBancariaVO contaBancariaVO = new ContaBancariaVO();
        contaBancariaVO.setAgenciaUsuario(contaBancaria.getAgenciaUsuario());
        contaBancariaVO.setNomeUsuario(contaBancaria.getNomeUsuario());
        contaBancariaVO.setNumeroConta(contaBancaria.getNumeroConta());
        if(contaBancaria.getChequeEspecialLiberado() == 0){
            contaBancariaVO.setChequeEspecialLiberado("Não Liberado");
        }else if(contaBancaria.getChequeEspecialLiberado() == 1){
            contaBancariaVO.setChequeEspecialLiberado("Liberado");
        }
        contaBancariaVO.setSaldoUsuario("R$ "+contaBancaria.getSaldoUsuario());
        contaBancariaVO.setChequeEspecial(contaBancaria.getChequeEspecial());
        contaBancariaVO.setTaxa(contaBancaria.getTaxa());
        return contaBancariaVO;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getAgenciaUsuario() {
        return agenciaUsuario;
    }

    public void setAgenciaUsuario(Integer agenciaUsuario) {
        this.agenciaUsuario = agenciaUsuario;
    }

    public String getChequeEspecialLiberado() {
        return chequeEspecialLiberado;
    }

    public void setChequeEspecialLiberado(String chequeEspecialLiberado) {
        this.chequeEspecialLiberado = chequeEspecialLiberado;
    }

    public String getSaldoUsuario() {
        return saldoUsuario;
    }

    public void setSaldoUsuario(String saldoUsuario) {
        this.saldoUsuario = saldoUsuario;
    }

    public String getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(String chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }
}
