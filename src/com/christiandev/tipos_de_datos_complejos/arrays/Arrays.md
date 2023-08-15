# Array

Un array en Java es una estructura de datos que permite almacenar varios elementos del mismo tipo en una sola variable. Puedes pensar en un array como una colección ordenada de elementos, donde cada elemento se almacena en una posición específica llamada índice. 
 
En Java, los arrays se declaran especificando el tipo de datos de los elementos que contendrá, seguido de corchetes cuadrados []. Por ejemplo, para declarar un array de enteros, se utiliza la siguiente sintaxis:

~~~
int[] miArray;
~~~ 

Una vez declarado el array, se puede inicializar y asignar valores a sus elementos. Por ejemplo:

~~~
int[] miArray = {1, 2, 3, 4, 5};
~~~ 

Los elementos de un array se acceden utilizando su índice, que comienza en 0. Por ejemplo, para acceder al primer elemento del array  miArray , se utilizaría  `miArray[0]` .

~~~
int primerElemento = miArray[0]; // Valor: 1
~~~

Los arrays en Java tienen un tamaño fijo, lo que significa que una vez que se declara e inicializa, no se puede cambiar su longitud. Si necesitas almacenar más elementos, tendrás que crear un nuevo array con el tamaño adecuado y copiar los elementos existentes. 
 
Además, Java proporciona métodos y funciones para trabajar con arrays, como obtener su longitud `( miArray.length )`, recorrerlos mediante bucles, ordenarlos, buscar elementos, entre otros. 
 
Es importante tener en cuenta que los arrays en Java solo pueden contener elementos del mismo tipo de datos. Si necesitas almacenar diferentes tipos de datos, puedes utilizar arrays de objetos o utilizar colecciones como List o ArrayList.

## Arrays Multidimensionales.

El concepto de array multidimensional en Java se refiere a una estructura de datos que permite almacenar elementos en una matriz con múltiples dimensiones. A diferencia de un array unidimensional, que es una lista lineal de elementos, un array multidimensional se organiza en filas y columnas, formando una especie de tabla o matriz. 
 
En Java, puedes crear arrays multidimensionales especificando el número de dimensiones al declarar el array. Por ejemplo, para crear una matriz bidimensional (2D) que almacene valores enteros, puedes utilizar la siguiente sintaxis:

~~~
int[][] miMatriz = new int[3][4];
~~~

En este caso,  miMatriz  es una matriz 2D con 3 filas y 4 columnas. Puedes pensar en ella como una tabla con 3 filas y 4 columnas, donde cada elemento se accede utilizando dos índices: uno para la fila y otro para la columna. 
 
Para acceder a los elementos de un array multidimensional, se utiliza la notación de corchetes cuadrados  [ ]  con los índices correspondientes. Por ejemplo, para acceder al elemento en la segunda fila y tercera columna de  miMatriz , puedes hacer lo siguiente:

~~~
int elemento = miMatriz[1][2];
~~~

También puedes recorrer un array multidimensional utilizando bucles anidados. Por ejemplo, para imprimir todos los elementos de  miMatriz , puedes hacer lo siguiente:

~~~
for (int i = 0; i < miMatriz.length; i++) {
    for (int j = 0; j < miMatriz[i].length; j++) {
        System.out.print(miMatriz[i][j] + " ");
    }
    System.out.println();
}
~~~

En este ejemplo, el bucle externo itera sobre las filas y el bucle interno itera sobre las columnas de cada fila, imprimiendo cada elemento. 
 
En resumen, un array multidimensional en Java te permite almacenar elementos en una estructura de tabla con múltiples filas y columnas. Puedes acceder a los elementos utilizando índices correspondientes y recorrer el array utilizando bucles anidados.

## Formas de recorrer un array.

Hay varias formas de recorrer un array en Java. Aquí te muestro tres métodos comunes: 
 1. Usando un bucle for: Puedes utilizar un bucle for tradicional para recorrer el array accediendo a cada elemento utilizando su índice. Aquí tienes un ejemplo:

 ~~~
int[] miArray = {1, 2, 3, 4, 5};
 for (int i = 0; i < miArray.length; i++) {
    System.out.println(miArray[i]);
}
~~~

2. Usando un bucle mejorado (for-each loop): Este bucle simplifica el proceso de recorrer un array. Itera automáticamente sobre cada elemento sin necesidad de una variable de índice. Aquí tienes un ejemplo:

~~~
int[] miArray = {1, 2, 3, 4, 5};
 for (int elemento : miArray) {
    System.out.println(elemento);
}
~~~

3. Usando el API Stream de Java 8: Si estás trabajando con Java 8 o una versión posterior, puedes utilizar el API Stream para operar en arrays. Puedes convertir el array a un stream y realizar diversas operaciones como filtrado, mapeo o reducción. Aquí tienes un ejemplo:

~~~
int[] miArray = {1, 2, 3, 4, 5};
 Arrays.stream(miArray)
      .forEach(System.out::println);
~~~

Estas son solo algunas formas de recorrer un array en Java. La elección del método depende de tus requisitos específicos y la versión de Java que estés utilizando.

