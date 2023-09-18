/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Atividade01 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);
        String login =  "joaoxxiii";
        String senha =  "123456";
        int contador = 0;
        String loginId = "";
        String senhaId = "";
        
        do {
        
            System.out.println("Digite o seu login: ");
             loginId = entrada.next();
             
             System.out.println("Digite a sua ");
             senhaId = entrada.next();
             
             contador ++;
             
             if(loginId.equals(login) && senhaId.equals(senha)){
             
                 System.out.println("Logado com sucesso");
                 break;
             }

        }while( contador < 3);{
        
           if(!loginId.equals(login) && !senhaId.equals(senha)){
               
            System.out.println("Suas tentativas acabaram");
        }
    }
        
        
        
        
    }
    
}
