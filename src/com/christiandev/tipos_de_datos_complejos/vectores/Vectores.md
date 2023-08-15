# Vectores en Java

Un vector en Java es una estructura de datos que almacena elementos de un mismo tipo en una secuencia ordenada. Es similar a un array, pero con la ventaja de que puede crecer dinámicamente en tamaño.  
 
En Java, un vector se implementa mediante la clase "Vector" de la biblioteca estándar. Puedes crear un vector utilizando la siguiente sintaxis:

~~~
Vector<TipoDeDato> nombreDelVector = new Vector<TipoDeDato>();
~~~

Aquí,  `TipoDeDato`  representa el tipo de dato que deseas almacenar en el vector, como por ejemplo  `Integer` ,  `String` , etc. 
 
Puedes agregar elementos al vector utilizando el método  `add()` :

~~~
nombreDelVector.add(elemento);
~~~

También puedes acceder a los elementos del vector utilizando el método  `get()`  y especificando el índice del elemento que deseas obtener:

~~~
TipoDeDato elemento = nombreDelVector.get(indice);
~~~

El tamaño del vector se puede obtener con el método  `size()` :

~~~
int tamaño = nombreDelVector.size();
~~~

Además, puedes realizar otras operaciones como eliminar elementos, buscar elementos, ordenar el vector, entre otros. La clase  Vector  proporciona métodos para realizar estas operaciones. 
 
Espero que esta explicación te haya sido útil. Si tienes alguna otra pregunta, no dudes en hacerla.

## Consideraciones que ahi que tener al usar Vectores.

Al utilizar vectores en Java, hay varias consideraciones a tener en cuenta: 
 
1. Capacidad: Los vectores tienen una capacidad determinada, que es la cantidad de elementos que puede contener antes de que necesite redimensionarse. Puedes especificar la capacidad inicial al crear un nuevo vector, pero también puede crecer dinámicamente según sea necesario. Sin embargo, redimensionar un vector puede ser costoso en términos de rendimiento, por lo que es importante elegir una capacidad inicial adecuada para evitar redimensionamientos innecesarios. 
 
2. Seguridad de tipos: Los vectores solo pueden contener elementos de un solo tipo, por lo que es importante asegurarse de que todos los elementos agregados al vector sean del mismo tipo. Esto se puede garantizar utilizando genéricos al declarar el vector. 
 
3. Sincronización: Los vectores están sincronizados, lo que significa que el acceso al vector es seguro para subprocesos. Sin embargo, esto también puede resultar en una reducción del rendimiento, por lo que si no necesitas seguridad de subprocesos, es posible que desees considerar el uso de un ArrayList en su lugar. 
 
4. Rendimiento: Los vectores pueden ser más lentos que otras clases de colección, como ArrayList, debido a la sobrecarga de sincronización y la necesidad de redimensionar el vector a medida que crece. Si el rendimiento es una preocupación, es posible que desees considerar el uso de una clase de colección diferente. 
 
5. Iteración: Al iterar sobre un vector, es importante utilizar un iterador en lugar de acceder a los elementos directamente utilizando un índice. Esto se debe a que el vector puede redimensionarse durante la iteración, lo que puede provocar una excepción de índice fuera de rango si estás accediendo a elementos por índice. 
 
Teniendo en cuenta estas consideraciones, puedes utilizar vectores de manera efectiva en tus programas de Java.

## Porque el uso de un vector puede ser costoso Computacionalmente hablando.

El uso de vectores puede ser costoso en términos computacionales por varias razones: 
 
1. Redimensionamiento: Los vectores tienen una capacidad fija, lo que significa que si se agrega un elemento más allá de esa capacidad, el vector debe redimensionarse para acomodar el nuevo elemento. Esto puede ser costoso en términos de tiempo de ejecución, ya que el vector debe copiar todos los elementos existentes a una nueva ubicación en la memoria, duplicando asi el uso de memoria. 
 
2. Búsqueda de elementos: Los vectores no están optimizados para la búsqueda de elementos, lo que significa que encontrar un elemento específico en un vector puede ser lento. En lugar de eso, se debe iterar sobre el vector para buscar el elemento deseado, lo que puede ser costoso en términos de tiempo de ejecución. 
 
3. Eliminación de elementos: Al eliminar un elemento de un vector, todos los elementos que vienen después del elemento eliminado deben moverse hacia arriba para llenar el espacio vacío. Esto puede ser costoso en términos de tiempo de ejecución, especialmente si el vector es grande y contiene muchos elementos. 
 
En general, los vectores son una estructura de datos útil para almacenar elementos en una secuencia ordenada, pero pueden ser menos eficientes que otras estructuras de datos, como las listas enlazadas o los árboles, en ciertas situaciones. Es importante evaluar cuidadosamente las necesidades de su programa y elegir la estructura de datos adecuada para su caso de uso específico.

## Ventajas y Desventajas del uso de vectores.

### Ventajas:

1. Acceso aleatorio: Los elementos en un vector se pueden acceder de manera aleatoria utilizando un índice, lo que facilita la recuperación de elementos en una posición específica del vector. 
2. Eficiencia: Los vectores son más eficientes que las listas enlazadas cuando se trata de acceder a elementos de forma aleatoria, ya que se almacenan en ubicaciones de memoria contiguas. 
3. Seguridad de tipos: Los vectores solo pueden contener elementos de un solo tipo, lo que ayuda a garantizar la seguridad de tipos y evita errores causados por tipos incompatibles. 
4. Seguridad de subprocesos: Los vectores están sincronizados, lo que significa que el acceso al vector es seguro para subprocesos. Esto puede ser útil en aplicaciones con múltiples subprocesos donde varios subprocesos pueden acceder al vector de manera concurrente. 

### Desventajas:

1. Redimensionamiento: Los vectores tienen una capacidad fija, lo que significa que si el vector necesita crecer más allá de su capacidad actual, debe redimensionarse. El redimensionamiento de un vector puede ser una operación costosa en términos de rendimiento, especialmente si el vector es grande. 
2. Inserción y eliminación: La inserción o eliminación de elementos en un vector puede ser costosa, ya que todos los elementos que vienen después del punto de inserción o eliminación deben desplazarse para dejar espacio al nuevo elemento o llenar el vacío dejado por el elemento eliminado. 
3. Uso de memoria: Los vectores pueden consumir más memoria que las listas enlazadas, ya que se almacenan en ubicaciones de memoria contiguas y deben redimensionarse si crecen más allá de su capacidad inicial. 
4. Funcionalidad limitada: Los vectores tienen una funcionalidad limitada en comparación con otras clases de colección, como conjuntos y mapas, lo que puede hacer que sean menos adecuados para ciertos casos de uso.