package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add( new Carro("GM"));
        carros.add(new Carro("VW"));


        System.out.println(carros.contains( new Carro("GM")));
        System.out.println(( new Carro("GM").hashCode()));
        System.out.println(( new Carro("GM1").hashCode()));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
