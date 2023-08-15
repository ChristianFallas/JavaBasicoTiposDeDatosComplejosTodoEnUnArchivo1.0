package com.christiandev.tipos_de_datos_complejos.arrays;

public class Arrays {
    
    public static void main(String[] args) {
        
        // Creación de un array con un numero especifico de elementos.
        // Esta forma de crear y rellenar una array solo se usa cuando desconocemos los elementos que van a conformar el array.
        int[] arrayUno = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        // Creación de un array con inicialización directa.
        int[] arrayDos = {1,2,3,4,5};

        // Otra forma de hacer un array. Una mas legible.
        String[] nombres = {
            "Christian",
            "Jason",
            "Luis",
            "Daniel"
        };

        // Recorriendo los arrays uno, dos y nombres.
        for (int i : arrayUno) {
            System.out.println(i);
        }
        for (int i : arrayDos) {
            System.out.println(i);
        }
        for (String i : nombres) {
            System.out.println(i);
        }
            // Forma larga
        for (int i=0; i < nombres.length; i++) {
            System.out.println("Nombre: " + i + " " + nombres[i]);
        } // La ventaja de usar la forma larga es que obtengo el indice.


        // Para conocer la longitud de un array
        System.out.println("La longitud de mi arrayUno es: " + arrayUno.length);
        // Nota: nótese que en los Strings length() es un método, mientras que en los arrays es una propiedad.
        

        // Array Multidimensional  Cuando no conocemos los valores.
        int[][] arrayBi = new int[2][3];
        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
            //Cuando conocemos los valores.
        int[][] arrayBi2 = {
            {1,2,3},
            {10,20,30}
        };
        System.out.println(java.util.Arrays.deepToString(arrayBi2) + "Estoy aqui.");
            // Recorriendo un array multidimensional.
        for(int i=0; i < arrayBi.length; i++) {

            for(int j=0; j<arrayBi[i].length; j++) {
                System.out.println("El indice es: " + i + " La columna es: " + j); // Aquí muestro el indice y la columna.
                System.out.println(arrayBi[i][j]); // Aquí muestro el contenido del array.
            }
        }


/*
 * Nota Importante:
 * Los arrays una ves creados no podemos añadir mas elementos, si tenemos un array
 * de 5 elementos después no le puedo agregar un sexto.  Ya que el numero de ele-
 * mentos con que declaramos el array es fijo y no puede cambiar.
 */
    }
}
