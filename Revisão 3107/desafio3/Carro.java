/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio3;

/**
 *
 * @author laboratorio
 */
public class Carro {
    public String marca;
    public String modelo;
    
     public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
     
     public Carro (String marca){
         this.marca = marca;
     }
    
    public String retornaMarca(){
        return this.marca;
    }
    public String retornaModelo(){
        return this.modelo;
    }
    
    public void Alugar(){
        System.out.println("Carro: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("ALUGADO!");
    
    }
    
    public void Devolver(){
        System.out.println("Carro: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("DEVOLVIDO!");
    }
    
    public void exibirDados(){
        System.out.println("EXIBINDO DADOS:");
        System.out.println("Carro: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
    
   
}
