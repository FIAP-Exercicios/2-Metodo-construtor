package Exercicio03;

import java.util.Random;

public class BilheUnico {

    int numero;
    String usuario;
    double saldo;
    final static double valorBase=5.40;
    String tipoTarifa;


    public BilheUnico(String usuario,String tipoTarifa){
        Random rd= new Random(10000);

        this.numero = rd.nextInt(0, 999999);
        this.usuario=usuario;
        this.tipoTarifa=tipoTarifa;

    }

    public boolean passarNaCatraca(){
        double valor= valorBase;
        if (tipoTarifa.equalsIgnoreCase("professor") || tipoTarifa.equalsIgnoreCase("estudante")){

            valor=valorBase/2;

        }
        if (saldo < valor){
            System.out.println("VC É INUTIL, VC NÃO TEM DINHEIRO, VC DEU PRESENTE PRA NAMORA, EU TE ENTENDO, " +
                    "CASO VC NAO TENHA NAMORA, ENTÃO VC TEM DINHEIRO, RECARREGUE, SE MATE!");

            return false;
        }

        else {
            saldo-=valor;
            return true;
        }

    }

}
