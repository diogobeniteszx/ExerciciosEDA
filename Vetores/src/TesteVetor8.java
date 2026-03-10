public class TesteVetor8 {
    static void main() {
        //12B. TesteVetor8 — Testar remove(String elemento)
        //- Vetor: A, B, C, B, D.
        //- Remova "B" → só a primeira ocorrência desaparece.
        //- Remova "X" → false, vetor permanece igual.

        Vetor vetor = new Vetor(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        System.out.println(vetor);

        vetor.remove("B");
        System.out.println(vetor);

        System.out.println(vetor.remove("X"));
        System.out.println(vetor);
    }
}
