import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //1. Método boolean estaVazia()
    //Implemente um método que retorna true se o vetor está vazio (tamanho == 0).
    public boolean estaVazia() {
        if (this.tamanho == 0) {
            return true;
        }
        return false;
    }

    //2. Método String ultimo()
    //Retorna o último elemento válido. Se o vetor estiver vazio, lance IllegalStateException.
    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        return this.elementos[this.tamanho - 1];
    }

    //3. Método void imprimeUmPorLinha()
    //Imprima todos os elementos válidos do vetor, um por linha.
    public void imprimeUmPorLinha() {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        else {
            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(this.elementos[i]);
            }
        }
    }

    //4. Método boolean contem(String elemento)
    //Retorna true se o vetor contém o elemento. Caso contrário, false
    public boolean contem(String elemento) {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        else {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].equals(elemento)) {
                    return true;
                }
            }
            return false;
        }
    }

    //6. TesteVetor2
    //Crie um vetor com 10 posições, adicione 4 elementos, teste busca(String) e contem(String).
    public int busca(String elemento) {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        else {
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return -1;
        }
    }

    //8. Método void limpar()
    //Zere o vetor, removendo todos os elementos.
    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    //9. Método int contarOcorrencias(String elemento)
    //Conte quantas vezes o elemento aparece no vetor.
    public int contarOcorrencias(String elemento) {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        else {
            int c = 0;
            for (int i = 0; i < this.tamanho; i++) {
                if (this.elementos[i].equals(elemento)) {
                    c++;
                }
            }
            return c;
        }
    }

    //10. Método boolean substituir(String antigo, String novo)
    //Substitua a primeira ocorrência de “antigo” por “novo”.
    public boolean substituir(String antigo, String novo) {
        if (estaVazia()) {
            throw new IllegalStateException("Vetor vazio");
        }
        else {
            int posicao = busca(antigo);
            if (posicao != -1) {
                this.elementos[posicao] = novo;
                return true;
            }
            return false;
        }
    }

    //11. Método void remove(int posicao)
    //Implemente um método que remove o elemento de uma posição específica.
    //Regras:
    //1. Se a posição for inválida, lance IllegalArgumentException.
    //2. Desloque os elementos à direita uma posição para a esquerda.
    //3. Decremente tamanho.
    //4. Opcional: limpar a última posição usada.
    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        else {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.elementos[this.tamanho - 1] = null;
            this.tamanho--;
        }
    }

    //12. Método boolean remove(String elemento)
    //Regras:
    //1. Use busca(elemento).
    //2. Se não encontrar, retorne false.
    //3. Se encontrar, chame remove(posicao).
    //4. Retorne true.
    public boolean remove(String elemento) {
        int posicao = busca(elemento);
        if (posicao == -1) {
            return false;
        }
        remove(posicao);
        return true;
    }

    //13. Método int indiceUltimo(String elemento)
    //Retorna a última ocorrência do elemento ou -1.
    public int indiceUltimo(String elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //14. Método void removerTodos(String elemento)
    //Remove todas as ocorrências. Sugestão: while(remove(elemento)){}.
    public void removerTodos(String elemento) {
        while (remove(elemento));
    }

    //15. Método boolean adicionarSeNaoExiste(String elemento)
    //Somente adiciona se não existir no vetor.
    public boolean adicionarSeNaoExiste(String elemento) {
        if (busca(elemento) != -1) {
            return false;
        }
        adiciona(elemento);
        return true;
    }

    //16. Método boolean inserirDepois(String referencia, String novoElemento)
    //Insere após a primeira ocorrência de referencia.
    public boolean inserirDepois (String referencia, String novoElemento) {
        int posicao = busca(referencia);
        if (posicao == -1) {
            return false;
        }
        for (int i = this.tamanho - 1; i > posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao + 1] = novoElemento;
        this.tamanho++;
        return true;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}
