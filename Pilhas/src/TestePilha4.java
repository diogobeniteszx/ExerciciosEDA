public class TestePilha4 {
    static void main() {
        String frase = "eu gosto de java";
        String[] palavras = frase.split(" ");
        Pilha<String> pilha = new Pilha<>(palavras.length);

        for (String p : palavras) {
            pilha.empilha(p);
        }

        String inverso = "";
        while (!pilha.estaVazia()) {
            inverso += pilha.desempilha() + " ";
        }

        System.out.println(inverso);
    }
}
