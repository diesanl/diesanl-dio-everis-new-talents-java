package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        //tries to add and, if not able to, then returns an error
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros);

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        //tries to add and, if not able to, then returns false
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //returns the 1st of the queue, returns null if empty
        System.out.println("PEEK: " + queueCarros.peek());
        System.out.println(queueCarros);

        //removes the 1st of the queue
        System.out.println("POLL: " + queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println("IS EMPTY?: " + queueCarros.isEmpty());
        System.out.println("SIZE: " + queueCarros.size());
    }
}
