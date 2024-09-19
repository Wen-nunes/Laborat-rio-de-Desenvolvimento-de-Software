/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import Conexao.Conexao;
import DAO.PessoaDAO;
import beans.Pessoa;

/**
 *
 * @author laboratorio
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Pessoa p = new Pessoa();
            
           p.setNome("Felipe");
           p.setSexo("M");
           p.setIdioma("Português");
           
           PessoaDAO pDAO = new PessoaDAO();
           pDAO.inserir(p);
        
    }
    
}
