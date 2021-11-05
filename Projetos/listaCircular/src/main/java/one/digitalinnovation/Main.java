package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");
        listaCircular.add("c1");
        listaCircular.add("c2");
        listaCircular.add("c3");
        listaCircular.add("c4");
        listaCircular.add("c5");
        listaCircular.add("c6");
        listaCircular.add("c7");

        System.out.println(listaCircular);


//        System.out.println(listaCircular.get(7));
//        System.out.println(listaCircular.get(15));
//        System.out.println(listaCircular.get(0));


        for (int i = 0; i < 15; i++) {
            System.out.println(listaCircular.get(i));
        }

    }
}
