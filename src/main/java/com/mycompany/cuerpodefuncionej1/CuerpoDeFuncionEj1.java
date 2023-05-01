/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cuerpodefuncionej1;

/**
 *
 * @author kenne
 */
public class CuerpoDeFuncionEj1 {

    static int a = 5;
    static int b = 8;
    static int sumaTotal = suma(a, b); // Llamar a la función "suma"

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args) {
       System.out.print("la suma es = "+sumaTotal);
        
        
    }
}
