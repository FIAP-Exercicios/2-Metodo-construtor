package Exercicio03;

import java.util.Random;

public class BilheUnico {

    int numero;
    String usuario;
    double saldo;
    final static double valorBase=5.50;
    String tipoTarifa;


    public BilheUnico(String usuario,String tipoTarifa, double saldo){
        Random rd= new Random(10000);

        this.numero = rd.nextInt(0, 999999);
        this.usuario=usuario;
        this.tipoTarifa=tipoTarifa;
        this. saldo= saldo;
    }

    public void passarNaCatraca(){
        double valor= valorBase;
        if (tipoTarifa.equalsIgnoreCase("professor") || tipoTarifa.equalsIgnoreCase("estudante")){

            valor=valorBase/2;

        }
        if (saldo < valor){

            System.out.println("VC É INUTIL, VC NÃO TEM DINHEIRO, VC DEU PRESENTE PRA NAMORA, EU TE ENTENDO, " +
                    "CASO VC NAO TENHA NAMORA, ENTÃO VC TEM DINHEIRO, RECARREGUE, SE MATE!");
            return;
        }
        saldo-=valor;

    }

}
