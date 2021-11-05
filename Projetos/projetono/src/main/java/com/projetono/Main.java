package com.projetono;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo nó 1");
        No<String> no2 = new No<>("Conteudo nó 2");
        No<String> no3 = new No<>("Conteudo nó 3");
        No<String> no4 = new No<>("Conteudo nó 4");

        //apontamos no1>no2>no3>no4>null
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        //No1
        System.out.println(no1);
        //No2
        System.out.println(no1.getProximoNo());

        //No3 - a partir do no1
        System.out.println(no1.getProximoNo().getProximoNo());

        //No4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());


    }
}
