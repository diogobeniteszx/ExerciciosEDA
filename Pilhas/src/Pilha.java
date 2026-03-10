public class Pilha <T> {
    //1. Implementar uma pilha
    //Crie uma classe Pilha que utilize um vetor para armazenar os elementos.
    //A classe deve possuir:
    //• um vetor chamado elementos
    //• uma variável chamada tamanho

    //Implemente os métodos:
    //empilha(String elemento)
    //desempilha()
    //topo()
    //estaVazia()
    //tamanho()

    public T[] elementos;
    public int tamanho;

    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public boolean empilha(T elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public T desempilha() {
        if (estaVazia()) {
            return null;
        }
        T temp = this.elementos[this.tamanho - 1];
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
        return temp;
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]);

            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
