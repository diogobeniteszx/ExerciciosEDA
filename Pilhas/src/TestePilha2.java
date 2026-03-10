public class TestePilha2 {
    static void main() {
        //4. Inverter uma palavra
        //Utilize uma pilha para inverter a palavra:
        //hello
        //Saída esperada:
        //olleh

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
