public class TestePilha4 {
    static void main() {
        //6. Inverter a ordem das palavras
        //Utilize uma pilha para inverter a ordem das palavras da frase:
        //eu gosto de java
        //Saída esperada:
        //java de gosto eu

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
