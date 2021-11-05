package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        //tries to add and, if not able to, then returns an error
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros);

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Peugeot")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
        System.out.println(listCarros.get(2));
    }
}
