package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() {
        return null == refNoEntradaPilha ? true : false;
    }

    //returns topo pilha
    public No top() {
        return refNoEntradaPilha;
    }

    //add No
    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;//guarda ref de topo antigo
        refNoEntradaPilha = novoNo;//guarda ref do topo novo
        refNoEntradaPilha.setRefNo(refAuxiliar);//referencia de próximo nó (ou anterior) eh o antigo topo
    }

    //removes topo pilha
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = this.refNoEntradaPilha;
            //pega a referencia do no anterior e atribui
            refNoEntradaPilha = this.refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {

        String stringRetorno = "----------\n";
        stringRetorno+= "       Pilha\n";
        stringRetorno+= "----------\n";

        No noAux = this.refNoEntradaPilha;

        while (true){
            if (noAux != null) {
                stringRetorno+="[No{dado="+ noAux.getDado()+ "}]\n";
                noAux = noAux.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno+= "==========\n";
        return stringRetorno;
    }
}
