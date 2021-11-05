package one.digitalinnovation;

public class No<T> {

    private T obj;
    private No<T> refNo;

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public No() {
    }

    public No(T obj) {
        this.refNo = null;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "No{" +"obj=" + obj+"}";
    }
}
