/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repeticaonumerica;

/**
 *
 * @author Hayyra
 */
import java.util.Scanner;
public class Repeticaonumerica {

    public static void main(String[] args) {
       int n, s=0;
       String resp;
       Scanner teclado=new Scanner (System.in);
       do{
           System.out.print("Digite um numero: ");
           n= teclado.nextInt();
           s+=n;
           System.out.print("Quer continuar ?[S/N]");
           resp=teclado.next();
       }while(resp.equals("S"));
       System.out.println("A soma de todos os valores e" +s);
            
           
    }
}
    
