/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.people;

import esocial.taxes.Guia;
import esocial.taxes.Imposto;

/**
 *
 * @author rodrigo
 */
public class Empregado extends Pessoa {
    private String dataNascimento, numeroNIS, cor, escolaridade, 
            numCarteiraDeTrabalho, dataAdmissao;
    private float salario;
    private Imposto[] listaImpostosCobrados;
    private Guia[] listaGuias;

    public Empregado(String dataNascimento, String numeroNIS, String cor, 
            String escolaridade, String numCarteiraDeTrabalho, 
            String dataAdmissao, float salario, String cpf, String nome, 
            String telefone, String email) {
        super(cpf, nome, telefone, email);
        this.dataNascimento = dataNascimento;
        this.numeroNIS = numeroNIS;
        this.cor = cor;
        this.escolaridade = escolaridade;
        this.numCarteiraDeTrabalho = numCarteiraDeTrabalho;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.listaImpostosCobrados = new Imposto[100];
        this.listaGuias = new Guia[100];
    }
    
    public boolean temImposto(Imposto novoImposto) {
        for (Imposto imposto : this.listaImpostosCobrados) {
            if (imposto != null && imposto.getNome()
                    .equals(novoImposto.getNome()))
                return true;
        }
        
        return false;
    }
    
    public void adicionarImpostos(Imposto[] listaImpostos) {
        int i = 0;
        for (Imposto imposto : listaImpostos) {
            if (imposto != null && imposto.getFaixaInicial() <= this.salario 
                    && this.salario <= imposto.getFaixaFim() 
                    && !temImposto(imposto)) {
                for (; i < this.listaImpostosCobrados.length; i++) {
                    if (this.listaImpostosCobrados[i] == null) {
                        this.listaImpostosCobrados[i] = imposto;
                        break;
                    }
                }
                
                if (i == this.listaImpostosCobrados.length)
                    break;
            }
        }
    }
    
    public boolean temGuia(Guia novaGuia) {
        for (Guia guia : this.listaGuias) {
            if (guia != null && guia.getData().equals(novaGuia.getData()))
                return true;
        }
        
        return false;
    }
    
    public boolean adicionarGuia(Guia novaGuia) {
        if (!temGuia(novaGuia)) {
            for (int i = 0; i < this.listaGuias.length; i++) {
                if (this.listaGuias[i] == null) {
                    this.listaGuias[i] = novaGuia;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public Guia buscarGuia(String guiaProcuradaData) {
        for (Guia guia : this.listaGuias) {
            if (guia != null && guia.getData().equals(guiaProcuradaData
                    .toUpperCase()))
                return guia;
        }
        
        return null;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroNIS() {
        return numeroNIS;
    }

    public void setNumeroNIS(String numeroNIS) {
        this.numeroNIS = numeroNIS;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNumCarteiraDeTrabalho() {
        return numCarteiraDeTrabalho;
    }

    public void setNumCarteiraDeTrabalho(String numCarteiraDeTrabalho) {
        this.numCarteiraDeTrabalho = numCarteiraDeTrabalho;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Imposto[] getListaImpostosCobrados() {
        return listaImpostosCobrados;
    }

    public void setListaImpostosCobrados(Imposto[] listaImpostosCobrados) {
        this.listaImpostosCobrados = listaImpostosCobrados;
    }

    public Guia[] getListaGuias() {
        return listaGuias;
    }

    public void setListaGuias(Guia[] listaGuias) {
        this.listaGuias = listaGuias;
    }
}
