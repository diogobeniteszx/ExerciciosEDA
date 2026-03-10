public class TesteVetor11 {
    static void main() {
        //15B. TesteVetor11
        //Adicionar várias vezes e confirmar que só aparece uma vez.

        Vetor vetor = new Vetor(7);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        System.out.println(vetor);

        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("B");
        vetor.adicionarSeNaoExiste("C");
        vetor.adicionarSeNaoExiste("D");
        System.out.println(vetor);
    }
}
