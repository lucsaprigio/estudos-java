package br.com.treinaweb.semana2.classes;

public class Atendimento {

    private String data;

    // Aqui aplicamos a composição, que vai ser quando criamos um método que vai ser uma classe externa
    private Cliente cliente;

    private Diarista diarista;

    // Quando coloco private eu crio um encapsulamento, então esse método não vai poder ser alterado/visualizado fora da classe
    private int horas;

    // Setter vai atribuir o valor no meu atributo privado
    public void setHoras(int horas){
        if(horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1, e nem maior que 12");
        } else {
            this.horas = horas;
        }
    }

    // Geter vai retornar o valor do meu atributo, não pode ser void, pois retorna o próprio atributo
    public int getHoras() {
        return horas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Diarista getDiarista() {
        return diarista;
    }

    public void setDiarista(Diarista diarista) {
        this.diarista = diarista;
    }

    
}
