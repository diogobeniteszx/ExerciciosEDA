public class TesteVetor10 {
    static void main() {
        //14B. TesteVetor10
        //Testar com múltiplas ocorrências.

        Vetor vetor = new Vetor(7);

        vetor.adiciona("B");
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");
        System.out.println(vetor);

        vetor.removerTodos("B");
        System.out.println(vetor);
    }
}
