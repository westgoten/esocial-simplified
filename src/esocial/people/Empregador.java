/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.people;

/**
 *
 * @author rodrigo
 */
public class Empregador extends Pessoa {
    private Empregado[] listaEmpregados;

    public Empregador(String cpf, String nome, String telefone, String email) {
        super(cpf, nome, telefone, email);
        this.listaEmpregados = new Empregado[100];
    }
    
    public boolean temEmpregado(Empregado novoEmpregado) {
        for (Empregado empregado : this.listaEmpregados) {
            if (empregado != null && (empregado.getNome()
                    .equals(novoEmpregado.getNome()) || empregado.getCpf()
                            .equals(novoEmpregado.getCpf())))
                return true;
        }
        
        return false;
    }
    
    public Empregado buscarEmpregado(String empregadoNome) {
        for (Empregado empregado : this.listaEmpregados) {
            if (empregado != null && empregado.getNome()
                    .equals(empregadoNome.toUpperCase()))
                return empregado;
        }
        
        return null;
    }
    
    public boolean adicionarEmpregado(Empregado novoEmpregado) {
        for (int i = 0; i < this.listaEmpregados.length; i++) {
            if (this.listaEmpregados[i] == null) {
                this.listaEmpregados[i] = novoEmpregado;
                return true;
            }
        }
        return false;
    }
    
    public boolean removerEmpregado(Empregado empregado) {
        for (int i = 0; i < this.listaEmpregados.length; i++)
            if (this.listaEmpregados[i] != null && this.listaEmpregados[i]
                    .getNome().equals(empregado.getNome())){
                this.listaEmpregados[i] = null;
                return true;
            }
        return false;
    }
    
    public boolean removerEmpregado(String empregadoNome) {
        for (int i = 0; i < this.listaEmpregados.length; i++)
            if (this.listaEmpregados[i] != null && this.listaEmpregados[i]
                    .getNome().equals(empregadoNome.toUpperCase())){
                this.listaEmpregados[i] = null;
                return true;
            }
        return false;
    }

    public Empregado[] getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(Empregado[] listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }
}
