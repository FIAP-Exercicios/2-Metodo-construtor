package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nome;

        SenhaAtendimento s1= new SenhaAtendimento("lindo");
        SenhaAtendimento s2= new SenhaAtendimento("lindo 2");
        SenhaAtendimento s3= new SenhaAtendimento("lindo 3");

        System.out.println(s1.getNome());
        System.out.println(s2.getNome());
        System.out.println(s3.getNome());


        System.out.println(SenhaAtendimento.controle);

    }
}
