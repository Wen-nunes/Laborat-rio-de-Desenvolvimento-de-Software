/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio3;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Locadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String marca, modelo;
        System.out.println("Digite a marca do carro: ");
        marca = sc.nextLine();
        System.out.println("Digite a modelo do carro: ");
        modelo = sc.nextLine();
        Carro c = new Carro(marca,modelo);
        c.exibirDados();
        
        System.out.println("Digite a marca do carro: ");
        marca = sc.nextLine();
        System.out.println("Digite a modelo do carro: ");
        modelo = sc.nextLine();
        Carro c2 = new Carro(marca,modelo);
         
        c2.exibirDados();
        
        marca = "Porsche";
        Carro c3 = new Carro (marca, "");
        c3.exibirDados();
    }
}
