package br.com.treinaweb.semana2.classes;

// Para criar uma herança entre as classes utilizamos o extends
public class Cliente extends Pessoa {
    public Cliente(String nome, String telefone, String endereco) {
        // Utilizamos a palavra super, para poder atribuir os valores do constructor criado em pessoa
        super(nome, telefone, endereco);
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor + (valor * 0.1);
        this.setSaldo(novoSaldo);
    }

    @Override
    public void sacar(double valor) {  
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor; 
        this.setSaldo(novoSaldo);
    }

    // Sobrescrevendo o método toString, pois quand imprimimos somente a variavel instanciada
    // ele pega do método de uma classe que seria "classe@hash"
    @Override
    public String toString() {
        return "Diarista: " + this.getNome() ;
    }
}
