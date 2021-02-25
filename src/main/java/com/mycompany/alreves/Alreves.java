/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alreves;

import java.util.Scanner;
public class Alreves {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n1, n2, n3, n4;
        System.out.println("Ingrese un numero de cuatro cifras");
        num = sc.nextInt();
        n4 = num % 10;
        n3 = num % 100 / 10;
        n2 = num % 1000 / 100;
        n1 = num % 10000 / 1000;
        System.out.println("El numero original es: " +num +"\nY al reves se lee: " +n4+n3+n2+n1);
    }
    
}