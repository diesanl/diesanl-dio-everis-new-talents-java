package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Object> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        //removes the top of stack
        stackCarros.pop();
        System.out.println(stackCarros);

        //show the top of the stack, not removing it
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        //check if the stack is empty
        System.out.println(stackCarros.empty());



    }
}
