package Exercicio03;
import java.util.Scanner;

public class Main {

        static Scanner sc = new Scanner(System.in);
        static BilheUnico bilheUnico;
        static{
        System.out.println("Qual é o seu nome--> ");
        String nome= sc.next();

        System.out.println("Qual é o tipo de tarifa(estudante ou professor)--> ");
        String tipoTarifa= sc.next();

        bilheUnico= new BilheUnico(nome, tipoTarifa);
    }

    public static void main(String[] args) {

        int respostas;


        do {
            System.out.println("1. Carregar Bilhete" + "\n" + "2. Consultar Saldo" + "\n" + "3. Passar na catraca" + "\n" + "4. Sair");
            respostas=sc.nextInt();
            switch (respostas) {
                case (1) -> carregar();

                case (2) -> consultar();

                case (3) -> catraca();

                case (4) ->
                        System.out.println("Até logo");
            }
        }
        while (respostas != 4);

        System.out.println();

    }

    private static void catraca() {
        if (bilheUnico.passarNaCatraca()){

        }
    }

    private static void consultar() {

        System.out.println("Saldo atual R$" + bilheUnico.saldo);

    }

    public static void carregar(){
        System.out.println("Quanto você deseja carregar");
        double valor=sc.nextDouble();

        bilheUnico.saldo+= valor;
    }




}
