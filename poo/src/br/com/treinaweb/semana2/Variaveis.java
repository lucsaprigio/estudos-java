package br.com.treinaweb.semana2;

public class Variaveis {
  public static void main(String[] args) {
    String nome = "Lucas";
    int idade = 27;
    float altura = 1.7f;
    double altura2 = 1.7;
    boolean estaVivo = true;

    var variavel = "Variável";

    System.out.println(nome);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(altura2);
    System.out.println(estaVivo);
    System.out.println(variavel);

    final var CONSTANTE = "Constante";

    // Se tentar atribuir valor na constante ela vai dar erro
    // constante = "2";

    System.out.println(CONSTANTE);
  }
}
