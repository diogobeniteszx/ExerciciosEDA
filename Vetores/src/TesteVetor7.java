public class TesteVetor7 {
    static void main() {
        //11B. TesteVetor7 — Testar remove(int posicao)
        //- Crie um vetor e adicione: A, B, C, D, E.
        //- Remova posição 0, uma posição do meio e a última.
        //- Imprima o vetor e o tamanho após cada remoção.
        //- Teste uma remoção inválida e observe a exceção.

        Vetor vetor = new Vetor(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

        vetor.remove(0);
        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

        vetor.remove(2);
        System.out.println(vetor.getTamanho());
        System.out.println(vetor);

        vetor.remove(10);
        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
    }
}
