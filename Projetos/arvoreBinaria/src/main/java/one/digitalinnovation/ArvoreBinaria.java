package one.digitalinnovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    private BinNo<T> add(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
            //check if content of new newNo is less than actualNo () and returns a negative integer, zero, or a positive integer
            // as this object is less than, equal to, or greater than the specified object. ((<) -1, (==) 0, (>) 1)
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
//        } else if (Integer.parseInt(novoNo.getConteudo().toString()) < Integer.parseInt(atual.getConteudo().toString())) {
            atual.setNoEsq(add(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(add(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void add(T content) {
        BinNo<T> novoNo = new BinNo<>(content);
        raiz = add(raiz, novoNo);
    }

    public void showInOrder() {
        System.out.println("\n Exibindo InOrder!!!");
        showInOrder(this.raiz);
    }

    private void showInOrder(BinNo<T> atual) {
        if (atual != null) {
            //first visit from left, show it and then visit from right
            showInOrder(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            showInOrder(atual.getNoDir());
        }
    }

    public void showPostOrder() {
        System.out.println("\n Exibindo PostOrder");
        showPostOrder(this.raiz);
    }

    private void showPostOrder(BinNo<T> atual) {
        if (atual != null) {
            //visit 2 first, then show after
            showPostOrder(atual.getNoEsq());
            showPostOrder(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\n Exibindo PreOrder");
        showPreOrder(this.raiz);
    }

    private void showPreOrder(BinNo<T> atual) {
        if (atual != null) {
            //show first, then visit 2
            System.out.print(atual.getConteudo() + ", ");
            showPreOrder(atual.getNoEsq());
            showPreOrder(atual.getNoDir());
        }
    }

    public void remove(T content) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> father = null;
            BinNo<T> son = null;
            BinNo<T> aux = null;

            while (atual != null && !atual.getConteudo().equals(content)) {
                father = atual;

                if (content.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteúdo não encontrado. Bloco Try");
            }

            if (father == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (aux = atual, son = atual.getNoEsq(); son.getNoDir() != null; aux = son, son = son.getNoEsq()) {
                        if (son != atual.getNoEsq()) {
                            aux.setNoDir(son.getNoEsq());
                            son.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    son.setNoDir(raiz.getNoDir());
                    this.raiz = son;
                }

            } else if (atual.getNoDir() == null) {
                if (father.getNoEsq() == atual) {
                    father.setNoEsq(atual.getNoEsq());
                } else {
                    father.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (father.getNoEsq() == atual) {
                    father.setNoEsq(atual.getNoDir());
                } else {
                    father.setNoDir(atual.getNoDir());
                }
            } else {
                for (aux = atual, son = atual.getNoEsq(); son.getNoDir() != null; aux = son, son = son.getNoDir()) {
                    if (son != atual.getNoEsq()) {
                        aux.setNoDir(son.getNoEsq());
                        son.setNoEsq(atual.getNoEsq());
                    }
                    son.setNoDir(atual.getNoDir());

                    if (father.getNoEsq() == atual) {
                        father.setNoEsq(son);
                    } else {
                        father.setNoDir(son);
                    }
                }
            }

        } catch (NullPointerException error) {
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }
    }

}
