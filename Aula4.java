/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula4;

import ucb.estudo.modelo.Pessoa;

/**
 *
 * @author luis.albuquerque
 */
public class Aula4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
            Pessoa p1 = new Pessoa();
                p1.setNome("luis felipe");
                p1.setCpf("040.808.051-52");
                p1.setPeso(68);
                p1.setAltura(1.88);

                Pessoa p2 = new Pessoa();
                p2.setNome("Cristiano ronaldo");
                p2.setCpf("040.808.051-51");
                p2.setPeso(68);
                p2.setAltura(1.88); 
                
                
     // Exibir dados da pessoa 1
    System.out.println("ola, seja bem vindo :" + p1.getNome());
    p1.exibirIMC();

    // Exibir dados da pessoa 2
    System.out.println("ola, seja bem vindo :" + p2.getNome());
    p2.exibirIMC();
    }
    
   
    
}

