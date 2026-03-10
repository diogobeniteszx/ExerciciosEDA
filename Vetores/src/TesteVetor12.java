public class TesteVetor12 {
    static void main() {
        //16B. TesteVetor12
        //Exemplo: vetor A, C, D → inserirDepois("A","B") → A, B, C, D.

        Vetor vetor = new Vetor(4);

        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("D");
        System.out.println(vetor);

        vetor.inserirDepois("A", "B");
        System.out.println(vetor);
    }
}
