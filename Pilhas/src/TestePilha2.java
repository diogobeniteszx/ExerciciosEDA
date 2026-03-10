public class TestePilha2 {
    static void main() {
        String palavra = "hello";
        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String inverso = "";
        while (!pilha.estaVazia()) {
            inverso += pilha.desempilha();
        }
        System.out.println(inverso);
    }
}
