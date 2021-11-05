package one.digitalinnovation;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila(No refNoEntradaFila) {
        this.refNoEntradaFila = refNoEntradaFila;
    }

    public Fila() {
    }

    public T first() {
        if (!isEmpty()) {
            No umDeterminadoNo = refNoEntradaFila;
            while (true) {
                if (null == umDeterminadoNo.getRefNo()) {
                    break;
                } else {
                    umDeterminadoNo = umDeterminadoNo.getRefNo();
                }
            }
            return (T) umDeterminadoNo.getObj();
        }
        return null;
    }

    public boolean isEmpty() {
        return null == refNoEntradaFila ? true : false;
    }

    //adds No on last position
    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //removes No on first position
    public T dequeue() {
        if (!isEmpty()) {
            No umDeterminadoNo = refNoEntradaFila;
            No noAuxiliar = this.refNoEntradaFila;
            while (true) {
                if (null == umDeterminadoNo.getRefNo()) {
                    noAuxiliar.setRefNo(null);
                    break;
                } else {
                    noAuxiliar = umDeterminadoNo;
                    umDeterminadoNo = umDeterminadoNo.getRefNo();
                }
            }
            return (T) umDeterminadoNo.getObj();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto= " + noAuxiliar.getObj() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }


        return stringRetorno;
    }
}
