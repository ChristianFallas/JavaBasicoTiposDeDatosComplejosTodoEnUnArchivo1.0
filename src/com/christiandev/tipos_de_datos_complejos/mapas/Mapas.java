package com.christiandev.tipos_de_datos_complejos.mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

//HashMap.
        //Creación de un HashMap.
        HashMap<String,Integer> mapa = new HashMap<>(); //Tanto la clave como el valor pueden ser de cualquier tipo.

        //Agregando elementos al mapa.
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        //Borrando elementos de un mapa.
        mapa.remove("clave4");

        //Remplazando elementos de un mapa.
        mapa.replace("clave2", 40);

        //Mostrar los elementos del mapa.
        System.out.println(mapa);

        //Mostrar un elemento en especifico del mapa.
        System.out.println(mapa.get("clave2"));
        
        //Recorriendo un mapa.
        for (Map.Entry<String, Integer> entry : mapa.entrySet() ) {
            System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
        }
        for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            System.out.println("Clave: " + clave + " Valor: " + valor);
        }

    }
}
