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
public class Aluno extends Usuario{
    public String matricula;
    public String curso;

    public Aluno(String nome,String matricula, String curso,  String dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
   public String executaAcao() {
        return "O aluno "+ nome +" foi cadastrado com Sucesso!!";
    }
    public Object[] obterDados(){
     return new Object[] {nome,matricula,cpf,dataNascimento,curso};
    }   
       
    
    
}
