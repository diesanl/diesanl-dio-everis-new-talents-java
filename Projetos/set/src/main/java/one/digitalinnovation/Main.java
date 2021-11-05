package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //HASHSET
        Set<Carro> hashSetCarros = new HashSet<>();

        //tries to add and, if not able to, then returns an error
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(hashSetCarros);

        System.out.println(hashSetCarros.contains(new Carro("Ford")));

        //TREESET - tree behavior
        TreeSet<Object> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Teste"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(treeSetCarros);

//        System.out.println(setCarros.get(2));
//
//        System.out.println(setCarros.indexOf(new Carro("Peugeot")));
//
//        System.out.println(setCarros.remove(2));
//        System.out.println(setCarros);
//        System.out.println(setCarros.get(2));


    }
}
