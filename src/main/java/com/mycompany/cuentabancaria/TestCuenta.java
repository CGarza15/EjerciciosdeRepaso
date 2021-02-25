/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentabancaria;

public class TestCuenta {
    public static void main(String[] args){
        Cuenta cuenta_1 = new Cuenta("Pedro");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
        cuenta_1.Ingresar(300);
        cuenta_2.Ingresar(400);
        cuenta_1.Retirar(500);
        cuenta_2.Retirar(100);
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
}
