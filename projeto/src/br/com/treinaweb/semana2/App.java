package src.br.com.treinaweb.semana2;

import src.br.com.treinaweb.semana2.models.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista =  new Diarista(1L, "Maria da Silva", "(27) 9 9999-9999", "123.123.123-11", "Teste");

        System.out.println(diarista.getId());
        System.out.println(diarista.getNome());
        System.out.println(diarista.getTelefone());
        System.out.println(diarista.getCpf());
        System.out.println(diarista.getEndereco());
    }
}