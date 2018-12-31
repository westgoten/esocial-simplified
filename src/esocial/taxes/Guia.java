/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.taxes;

import esocial.people.Empregado;
import java.util.Arrays;

/**
 *
 * @author rodrigo
 */
public class Guia {
    private String data;
    private float valor;
    private float salarioEmpregado;
    private Imposto[] listaImpostosCobrados;

    public Guia(String data, float salarioEmpregado, Imposto[] listaImpostosCobrados) {
        this.data = data;
        this.salarioEmpregado = salarioEmpregado;
        this.listaImpostosCobrados = Arrays.copyOf(listaImpostosCobrados, 
                listaImpostosCobrados.length);
    }
    
    public void calcularValor() {
        float somaImpostosPercentual = 0;
        for (Imposto imposto : this.listaImpostosCobrados)
            if (imposto != null)
                somaImpostosPercentual += imposto.getPercentual()/100;
        
        this.valor = this.salarioEmpregado * somaImpostosPercentual;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSalarioEmpregado() {
        return salarioEmpregado;
    }

    public void setSalarioEmpregado(float salarioEmpregado) {
        this.salarioEmpregado = salarioEmpregado;
    }

    public Imposto[] getListaImpostosCobrados() {
        return listaImpostosCobrados;
    }

    public void setListaImpostosCobrados(Imposto[] listaImpostosCobrados) {
        this.listaImpostosCobrados = listaImpostosCobrados;
    }
}
