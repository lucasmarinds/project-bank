package com.projetobanco.bankproject.VO;

import com.projetobanco.bankproject.entitys.ContaBancaria;

public class ContaBancariaVO {

    private String nomeUsuario;
    private String numeroContaEAgencia;
    private String chequeEspecialLiberado;
    private String saldoUsuario;
    private String chequeEspecial;
    private String taxa;

    public ContaBancariaVO(final ContaBancaria conta) {

        this.nomeUsuario = "\nNome: "+conta.getNomeUsuario();
        this.numeroContaEAgencia = "\nConta/Agencia: "+conta.getNumeroConta()+"/"+conta.getAgenciaUsuario();

        if(conta.getChequeEspecialLiberado()==1) {
            this.chequeEspecialLiberado = "\nCheque Especial Liberado: LIBERADO";
        }else if(conta.getChequeEspecialLiberado()==0){
            this.chequeEspecialLiberado = "\nCheque Especial Liberado: NÃO LIBERADO";
        }

        this.saldoUsuario = "\nSaldo: R$ "+conta.getSaldoUsuario();
        this.chequeEspecial = "\nCheque Especial: R$ "+conta.getChequeEspecial();
        this.taxa = "\nTaxa: R$ "+String.format("%.2f",novaTaxa(conta.getChequeEspecial()));
    }

    public Double novaTaxa(String valor) {
        double taxa;
        taxa = 0.02 * Double.parseDouble(valor.replace(".", "")
                .replace(",","."));
        return taxa;

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNumeroContaEAgencia() {
        return numeroContaEAgencia;
    }

    public void setNumeroContaEAgencia(String numeroContaEAgencia) {
        this.numeroContaEAgencia = numeroContaEAgencia;
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

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------CONTA--------------")
                .append(getNomeUsuario())
                .append(getNumeroContaEAgencia())
                .append(getChequeEspecialLiberado())
                .append(getSaldoUsuario())
                .append(getChequeEspecial())
                .append(getTaxa()+"\n");

        return stringBuilder.toString();
    }



}
