package Exercicio02;

public class SenhaAtendimento {

    String nome;
    int numeroS;
    static int controle =100;

    public SenhaAtendimento(String nome){

        this.nome= nome;
        numeroS= controle++;

    }
    public String getNome(){

        return "Paciente "+ nome + " | Senha #" + numeroS;

    }

}
