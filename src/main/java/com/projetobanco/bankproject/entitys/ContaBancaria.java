package com.projetobanco.bankproject.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contasbancarias")
public class ContaBancaria{

    private String nomeUsuario;
    @Id
    private Integer numeroConta;
    private Integer agenciaUsuario;
    private Integer chequeEspecialLiberado;
    private String saldoUsuario;
    private String chequeEspecial;
    private String taxa;

    @Column(name = "nome_usuario")
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Column(name = "numero_conta")
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Column(name = "agencia_usuario")
    public int getAgenciaUsuario() {
        return agenciaUsuario;
    }

    public void setAgenciaUsuario(int agenciaUsuario) {
        this.agenciaUsuario = agenciaUsuario;
    }

    @Column(name = "cheque_especial_liberado")
    public int getChequeEspecialLiberado() {
        return chequeEspecialLiberado;
    }

    public void setChequeEspecialLiberado(int chequeEspecialLiberado) {
        this.chequeEspecialLiberado = chequeEspecialLiberado;
    }

    @Column(name = "saldo_usuario")
    public String getSaldoUsuario() {
        return saldoUsuario;
    }

    public void setSaldoUsuario(String saldoUsuario) {
        this.saldoUsuario = saldoUsuario;
    }

    @Column(name = "cheque_especial")
    public String getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(String chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Column(name = "taxa")
    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    public String toString(){
        return "  | Nome:"+getNomeUsuario()+
                " | Numero da Conta e Agencia: "+getNumeroConta()+" / "+getAgenciaUsuario()+
                " | Cheque Especial Liberado: "+getChequeEspecialLiberado()+
                " | Saldo: R$ "+getSaldoUsuario()+
                " | Cheque Especial: "+getChequeEspecial()+
                " | Taxa: "+getTaxa()+" | \n";
    }
}
