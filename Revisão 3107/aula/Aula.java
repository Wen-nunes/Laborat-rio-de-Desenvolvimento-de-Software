/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

/**
 *
 * @author laboratorio
 */
public class Aula {

    
    public static void main(String[] args) {
        System.out.println("Ola mundo!!!");
        
        Pessoa p = new Pessoa();
        
        p.nome = "Wendel";
        p.idade = 25;
        p.email = "wendel.nunes@ufn.edu.br";
        
        System.out.println("Dados da pessoa: " + p.toString());
        
        Pessoa p2 = new Pessoa();
        
        p2.idade = 32;
        p2.nome = "Taiane";
        p2.email = "uehuehao";
        
        System.out.println("Idade da pessoa 2 : " + p2);
        
        Pessoa p3 = new Pessoa();
        
        p3.idade = 23;
        p3.nome = "vivane";
        p3.email = "uehuehao";
        
        
        System.out.println("Idade da pessoa 3 : " + p3);
    }
    
}
