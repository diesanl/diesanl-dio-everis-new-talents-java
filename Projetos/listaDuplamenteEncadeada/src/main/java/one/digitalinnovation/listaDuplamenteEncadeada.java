package one.digitalinnovation;

public class listaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private Integer tamanhoLista;

    public listaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T content) {
        NoDuplo<T> novoNo = new NoDuplo<>(content);
        //adding in the end of queue by default
        novoNo.setNoProx(null);
        novoNo.setNoAnt(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProx(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T content) {
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(content);
        novoNo.setNoProx(noAux);


        if (novoNo.getNoProx() != null) {
            novoNo.setNoAnt(noAux.getNoAnt());
            novoNo.getNoProx().setNoAnt(novoNo);
        } else {
            novoNo.setNoAnt(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnt().setNoProx(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {

        //check if we r on first no
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProx();
            if (primeiroNo != null) {
                primeiroNo.setNoAnt(null);
            }
        } else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnt().setNoProx(noAux.getNoProx());
            if (noAux != ultimoNo) {
                noAux.getNoProx().setNoAnt(noAux.getNoAnt());
            } else {
                ultimoNo = noAux;
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; (null != noAux) && (i < index); i++) {
            noAux = noAux.getNoProx();
        }
        return noAux;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo= " + noAux.getConteudo() + "}] ---->";
            noAux = noAux.getNoProx();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
