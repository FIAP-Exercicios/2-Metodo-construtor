package Exercicio01;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n;
        double v;
        int q;
        double aumentoV;

        System.out.println("Me informe seu nome--> ");
        n=sc.next();
        System.out.println("Me informe o valor do produto--> ");
        v=sc.nextDouble();
        System.out.println("Me informe a quantidade de produtos--> ");
        q= sc.nextInt();

        Produtos produtos= new Produtos(n,v,q);

        System.out.print("Me informe quantos % você deseja aumentar? ");
        aumentoV= sc.nextDouble();

        System.out.println("------------Preço antigo------------");
        System.out.println("Nome: "+produtos.nome +"\n"+ "Valor: $"+produtos.valor);
        System.out.println();

        produtos.Calcular(aumentoV);
        System.out.println("------------Preço atual------------");

        System.out.println("Nome: "+produtos.nome +"\n"+ "Valor: $"+produtos.valor);

    }
}