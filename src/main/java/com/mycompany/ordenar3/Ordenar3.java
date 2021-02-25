/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenar3;

import java.util.Scanner;
public class Ordenar3 {


    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Ingrese el valor del numero 1");
        n1 = sc.nextDouble();
        System.out.println("Ingrese el valor del numero 2");
        n2 = sc.nextDouble();
        System.out.println("Ingrese el valor del numero 3");
        n3 = sc.nextDouble();
        if(n1 > n2){
            if(n1 > n3){
                if(n2 > n3){
                   System.out.println(n1 +" es el mayor\n" +n2 +" es el mediano\n" +n3 +" es el menor"); 
                }
                else{
                    System.out.println(n1 +" es el mayor\n" +n3 +" es el mediano\n" +n2 +" es el menor");
                }
            }
            else{
                System.out.println(n3 +" es el mayor\n" +n1 +" es el mediano\n" +n2 +" es el menor");
            }
        }
        else{
            if(n2 > n3){
                if(n1 > n3){
                    System.out.println(n2 +" es el mayor\n" +n1 +" es el mediano\n" +n3 +" es el menor");
                }
                else{
                    System.out.println(n2 +" es el mayor\n" +n3 +" es el mediano\n" +n1 +" es el menor");
                }
            }
            else{
                System.out.println(n3 +" es el mayor\n" +n2 +" es el mediano\n" +n1 +" es el menor");
            }
        }
    }
    
}
