package br.com.semana2;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // if/else
        var idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        var mesDoAno = 1 ;
        switch(mesDoAno) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Mês inválido");
        }

/*      
        Forma de switch case a partir do java 13
        var mesesDoAno = 1 ;
        switch(mesDoAno) {
            case 1 -> System.out.println("Janeiro");
            case 2 ->System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            default -> System.out.println("Mês inválido");
        } */
    }
}
