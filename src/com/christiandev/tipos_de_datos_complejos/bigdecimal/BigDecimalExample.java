package com.christiandev.tipos_de_datos_complejos.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {

        // Esta ejemplo demuestra lo peligroso que pude ser trabajar con floats o doubles.
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f); 
        // Resultado esperado es: 1.0f Pero el que devuelve: 1.0000001

        //Cuando se desea manejar números grandes con decimales y con alta perdición es necesario usar
        // BigDecimal

    //Creación de valores con BigDecimal.
        BigDecimal num1 = new BigDecimal(10.5);
        BigDecimal num2 = new BigDecimal(5.2);
        
        //Suma.
        BigDecimal suma = num1.add(num2);
        System.out.println("Suma: " + suma);

        //Resta.
        BigDecimal resta = num1.subtract(num2);
        System.out.println("Resta: " + resta);

        //Multiplicación.
        BigDecimal multiplicacion = num1.multiply(num2);
        System.out.println("Multiplicación: " + multiplicacion);

        //Division.
        //BigDecimal division = num1.divide(num2);
        //System.out.println("Division: " + division);

        
        BigDecimal num3 = new BigDecimal(0.1);
        BigDecimal num4 = new BigDecimal(10.0);
        BigDecimal resultado = num3.multiply(num4);
        System.out.println("Resultado " + resultado);

    }
}
