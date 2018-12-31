/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.taxes;

/**
 *
 * @author 030071145
 */
public class Imposto {
    private String nome;
    private float percentual;
    private float faixaInicial, faixaFim;

    public Imposto(String nome, float percentual, float faixaInicial, float faixaFim) {
        this.nome = nome;
        this.percentual = percentual;
        this.faixaInicial = faixaInicial;
        this.faixaFim = faixaFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public float getFaixaInicial() {
        return faixaInicial;
    }

    public void setFaixaInicial(float faixaInicial) {
        this.faixaInicial = faixaInicial;
    }

    public float getFaixaFim() {
        return faixaFim;
    }

    public void setFaixaFim(float faixaFim) {
        this.faixaFim = faixaFim;
    }
    
    
}
