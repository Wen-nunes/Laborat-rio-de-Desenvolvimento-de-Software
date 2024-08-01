/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author laboratorio
 */
public class Diciplina {
     public static void main(String[] args) {
         Professor p = new Professor();
         p.nome = "Ricardo";
         Laboratorio l = new Laboratorio();
         l.local = "Sala 108";
         
         System.out.println("O nome do professor e "+ p.nome + "\nO local da aula e "+l.local);
         
     }
    
}
