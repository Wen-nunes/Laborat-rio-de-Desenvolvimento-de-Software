/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio2;

/**
 *
 * @author laboratorio
 */
public class main {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.ano = 1235;
        l.autor = "Zeca Pau Gordinho";
        l.titulo = "Chupa xoxota";
        
        System.out.println("Livro: " + l.titulo + "\nDo autor: "+l.autor+"\nDo ano: "+l.ano);
    }
}
