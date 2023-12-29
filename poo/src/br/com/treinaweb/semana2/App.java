package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Atendimento;
import br.com.treinaweb.semana2.classes.Cliente;
import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        // Criamos uma instancia da classe criada Diarista
        var diarista = new Diarista("Lucas", "9999999999", "Av Silvio Avidos", "123");

        System.out.println("Nome: " + diarista.getNome());        
        System.out.println("Nome: " + diarista.getTelefone());
        System.out.println("Nome: " + diarista.getEndereco());
        System.out.println("Chave pix " + diarista.getChavePix());
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.depositar(100);
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.sacar(40);
        System.out.println("Saldo " + diarista.getSaldo());
        diarista.atender("Cleyton");

        var cliente = new Cliente("Lucas", "(27) 9 9694-0045", "Teste");

        System.out.println(cliente.getNome());

        var cliente2  = new Cliente("Teste", "123456", "ABC");
        var diarista2 = new Diarista("Nome", "123456", "DEF", "123");

        cliente2.depositar(100);
        cliente2.transferir(diarista2, 50);

        System.out.println(cliente2.getSaldo());
        System.out.println(diarista2.getSaldo());

        System.out.println(cliente);
        System.out.println(diarista);


        // Composição - conseguimos utilizar a classe cliente e diarista pois utilizamos eles como método no Atendimento
        var atendimento = new Atendimento();
        atendimento.setData("08/10/2023");
        atendimento.setHoras(10);
        atendimento.setCliente(cliente);
        atendimento.setDiarista(diarista);

        System.out.println(atendimento.getData());
        System.out.println(atendimento.getHoras());
        System.out.println(atendimento.getCliente().getNome());
        System.out.println(atendimento.getDiarista().getNome());
    }
}