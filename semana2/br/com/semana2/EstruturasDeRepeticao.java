package br.com.semana2;

import java.util.ArrayList;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while e do-while
        var contador = 1;
        while(contador <= 2) {
            System.out.println("Número " + contador);
            contador++;
        }

        // no do while, mesmo a condição sendo falta, ele vai contar pelo menos uma vez
        do {
            System.out.println("Número " + contador);
            contador++;
        } while (contador <= 2);

        // for 
        for (var contador2 = 1; contador2 <= 1000; contador2++) {
            System.out.println("Número " + contador2);
        }

        //for
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(13.0);
        notas.add(15.0);

        for (var index = 0; index < notas.size(); index++) {
            System.out.println(notas.get(index));
        }

        // for each
        for(Double nota : notas) {
            System.out.println(nota);
        }

    }
}
