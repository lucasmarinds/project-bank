package com.projetobanco.bankproject.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContasBancarias{

    private String nome_usuario;
    @Id
    private int numero_conta;
    private int agencia_usuario;
    private int cheque_especial_liberado;
    private String saldo_usuario;
    private String cheque_especial;
    private String taxa;

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public int getAgencia_usuario() {
        return agencia_usuario;
    }

    public void setAgencia_usuario(int agencia_usuario) {
        this.agencia_usuario = agencia_usuario;
    }

    public int getCheque_especial_liberado() {
        return cheque_especial_liberado;
    }

    public void setCheque_especial_liberado(int cheque_especial_liberado) {
        this.cheque_especial_liberado = cheque_especial_liberado;
    }

    public String getSaldo_usuario() {
        return saldo_usuario;
    }

    public void setSaldo_usuario(String saldo_usuario) {
        this.saldo_usuario = saldo_usuario;
    }

    public String getCheque_especial() {
        return cheque_especial;
    }

    public void setCheque_especial(String cheque_especial) {
        this.cheque_especial = cheque_especial;
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    public String toString(){
        return "  | Nome:"+getNome_usuario()+
                " | Numero da Conta e Agencia: "+getNumero_conta()+" / "+getAgencia_usuario()+
                " | Cheque Especial Liberado: "+getCheque_especial_liberado()+
                " | Saldo: "+getSaldo_usuario()+
                " | Cheque Especial: "+getCheque_especial()+
                " | Taxa: "+getTaxa()+" | \n";
    }
}
