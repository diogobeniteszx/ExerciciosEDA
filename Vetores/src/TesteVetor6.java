public class TesteVetor6 {
    static void main() {
        //10B. TesteVetor6 — Testar substituir()
        //Substitua um elemento existente e tente substituir um inexistente.

        Vetor vetor = new Vetor(3);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println(vetor);

        vetor.substituir("Elemento 3", "Elemento 4");
        System.out.println(vetor);

        System.out.println(vetor.substituir("Elemento 0", "Elemento 5"));
    }
}
