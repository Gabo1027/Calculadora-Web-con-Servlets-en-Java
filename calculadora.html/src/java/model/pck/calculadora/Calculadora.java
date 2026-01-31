/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.pck.calculadora;

/**
 *
 * @author joser
 */
public class Calculadora {
    
    public double calcular(double numero1, double numero2, String operacion) {
        double resultado = 0;
        
        switch(operacion) {
            case "suma":
                resultado = numero1 + numero2;
                break;
            case "resta":
                resultado = numero1 - numero2;
                break;
            case "multiplicacion":
                resultado = numero1 * numero2;
                break;
            case "division":
                if(numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
                break;
        }
        
        return resultado;
    }
}
