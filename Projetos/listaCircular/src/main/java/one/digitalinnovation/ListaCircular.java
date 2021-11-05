package one.digitalinnovation;

public class ListaCircular<T> {
    private No<T> cabeca;

    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private No<T> getNo(int index) {
        No<T> noAux = new No<>();
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!!!!");
        }
        if (index == 0) {
            return this.cauda;
        } else {
            noAux = this.cauda;

            for (int i = 0; (i < index) && noAux != null; i++) {
                noAux = noAux.getNoProx();
            }
        }
        return noAux;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("N existe elemento nessa posição!!!!!");

        No<T> noAux = this.cauda;
        if (index == 0) {
            noAux = noAux.getNoProx();
            this.cabeca.setNoProx(noAux);
        } else if (index == 1) {
            this.cauda.setNoProx(this.cauda.getNoProx().getNoProx());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux = noAux.getNoProx();
            }
            noAux.setNoProx(noAux.getNoProx().getNoProx());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProx(this.cauda);
        } else {
            novoNo.setNoProx(this.cauda);
            this.cabeca.setNoProx(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAux = this.cauda;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No {Conteudo = " + noAux.getConteudo() + "}] ---->";
            noAux = noAux.getNoProx();
        }

        strRetorno += !isEmpty() ? "Retorna ao início" : "[]";

        return strRetorno;
    }
}
