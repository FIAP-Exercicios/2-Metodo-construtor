package Exercicio01;

public class Produtos {
    String nome;
    double valor;
    int quantidade;

    public Produtos(String nome, double valor,int quantidade){

        this.nome= nome;
        this.valor= valor;
        this.quantidade= quantidade;

    }
    public void Calcular(double aumentoV){

        valor *= 1 + aumentoV / 100;

    }
}
