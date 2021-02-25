/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adivinanumero;

import java.lang.*;
import java.util.Scanner;
public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num;
        N = (int)(Math.random()* 10);
        System.out.println("Adivina el numero");
        num = sc.nextInt();
        while(N <=  10){
            if(num == N){
              System.out.println("Correcto"); 
              break;
            }
            else{
                System.out.println("Has fallado, intenta otra vez");
                num = sc.nextInt();
            }
        }
    }
}