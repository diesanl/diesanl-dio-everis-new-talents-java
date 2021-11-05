package one.digitalinnovation;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProx;
    private NoDuplo<T> noAnt;

    public NoDuplo() {
    }

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProx() {
        return noProx;
    }

    public void setNoProx(NoDuplo<T> noProx) {
        this.noProx = noProx;
    }

    public NoDuplo<T> getNoAnt() {
        return noAnt;
    }

    public void setNoAnt(NoDuplo<T> noAnt) {
        this.noAnt = noAnt;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                ", noProx=" + noProx +
                ", noAnt=" + noAnt +
                '}';
    }
}

