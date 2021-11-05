package one.digitalinnovation;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = null;
    }

    public ListaEncadeada() {
    }

    public boolean isEmpty() {
        if (referenciaEntrada == null)
            return true;
        return false;
    }

    public Integer size() {
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProxNo() != null) {
                    referenciaAux = referenciaAux.getProxNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {

        No<T> novoNo = new No<T>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No noAux = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAux = noAux.getProxNo();
        }

        noAux.setProxNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    //private bcz we use only by this class
    private No<T> getNo(int index) {

        validateIndex(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRet = null;

        for (int i = 0; i <= index; i++) {
            noRet = noAux;
            noAux = noAux.getProxNo();
        }
        return noRet;
    }

    private void validateIndex(int index) {
        int lastIndex = size() - 1;

        if (index >= this.size()) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " is not available" +
                            "This list has this size: " + lastIndex);
        }
    }

    public T remove(int index) {

        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivo.getProxNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProxNo(noPivo.getProxNo());

        return noPivo.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAux = this.referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No { conteudo= " + noAux.getConteudo() + " }]--->";
            noAux = noAux.getProxNo();
        }
        strRetorno += "null";


        return strRetorno;
    }
}
