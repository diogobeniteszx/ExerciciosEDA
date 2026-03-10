public class TestePilha3 {
    static void main() {
        //5. Verificar palíndromo
        //Crie um programa que verifique se uma palavra é um palíndromo utilizando pilha.
        //Exemplos:
        //arara → É palíndromo
        //casa → Não é palíndromo

        String palavra = "arara";
        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String inverso = "";
        while (!pilha.estaVazia()) {
            inverso += pilha.desempilha();
        }

        if (palavra.equals(inverso)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
