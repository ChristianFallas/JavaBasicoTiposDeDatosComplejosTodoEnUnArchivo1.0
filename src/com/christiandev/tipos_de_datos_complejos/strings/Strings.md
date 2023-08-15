# Cadena de caracteres o String

En Java, el tipo de dato complejo "String" se utiliza para representar una secuencia de caracteres. Es una clase incorporada en Java y se utiliza ampliamente para almacenar y manipular texto. 
 
Un objeto de tipo String es inmutable, lo que significa que no se puede modificar una vez creado. Sin embargo, puedes realizar diversas operaciones en Strings, como concatenación, extracción de subcadenas, comparación, búsqueda, reemplazo, entre otras. 
 
Aquí hay un ejemplo de cómo declarar y utilizar una variable de tipo String en Java:

~~~
String miCadena = "Hola, mundo!";
System.out.println(miCadena); // Imprime "Hola, mundo!"

// Concatenación de Strings
String nombre = "John";
String apellido = "Doe";
String nombreCompleto = nombre + " " + apellido;
System.out.println(nombreCompleto); // Imprime "John Doe"

// Obtener la longitud de una cadena
int longitud = miCadena.length();
System.out.println("Longitud de la cadena: " + longitud); // Imprime "Longitud de la cadena: 13"

// Obtener una subcadena
String subcadena = miCadena.substring(0, 5);
System.out.println(subcadena); // Imprime "Hola,"
~~~

Esto es solo una introducción básica al tipo de dato String en Java. Hay muchas más operaciones y métodos disponibles para manipular y trabajar con Strings en Java.