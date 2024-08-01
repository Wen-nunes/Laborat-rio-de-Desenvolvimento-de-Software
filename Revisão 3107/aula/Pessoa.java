/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    public String nome;
    public int idade;
    public String email;
    
    @Override
    public String toString(){
        return "\nNome: "+this.nome+"\nIdade: "+this.idade+"\nEmail: "+this.email;
    }
    
}
