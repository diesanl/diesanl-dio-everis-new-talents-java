package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

//        System.out.println(minhaPilha.toString());

        System.out.println("Nó removido: "+minhaPilha.pop());

        System.out.println(minhaPilha.toString());

        minhaPilha.push(new No(516));

        System.out.println(minhaPilha.toString());
    }

}
