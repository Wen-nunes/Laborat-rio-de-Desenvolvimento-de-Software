/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocadastro;

/**
 *
 * @author Admin
 */
public class Professor extends Usuario {
    public String matriculaP;
    public String formacao;
    public String alocacao;

    public Professor(String nome,String matriculaP, String formacao, String alocacao,  String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.matriculaP = matriculaP;
        this.formacao = formacao;
        this.alocacao = alocacao;
    }

    public String getMatriculaP() {
        return matriculaP;
    }

    public void setMatriculaP(String matriculaP) {
        this.matriculaP = matriculaP;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

    public Object[] obterDados(){
     return new Object[] {nome,matriculaP,cpf,dataNascimento,alocacao, formacao};
    }

    @Override
    public String executaAcao() {
        return "O professor "+ nome +" foi cadastrado com Sucesso!!";
    }
    
    
}
