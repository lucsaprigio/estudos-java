package br.com.semana2;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        // Isso é parecido com o array no javascript, porém o método de criação é diferente

        // Instanciamos um ArrayList e dentro do operador <> colocamos uma classe, no caso utilizamos a Double  
        var notas = new ArrayList<Double>();
        notas.add(10.0);       
        notas.add(7.0);
        notas.add(6.1);

        System.out.println(notas);

        // Map -> semelhante a lista, mas é uma collection que armazena pares de chave e valor
        var medias = new HashMap<String, Double>();
        medias.put("Lucas", 10.0);        
        medias.put("Lucas1", 13.0);
        medias.put("Lucas2", 15.0);
        medias.put("Lucas3", 17.0);

        System.out.println(medias);

        // Para printar somente uma chave nós usamos o método get e colocamos a chave
        System.out.println(medias.get("Lucas3"));

    }
}
