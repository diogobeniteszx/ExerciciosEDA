public class TesteVetor5 {
    static void main() {
        //9B. TesteVetor5 — Testar contarOcorrencias()
        //Adicione elementos repetidos e imprima a contagem.

        Vetor vetor = new Vetor(3);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 1");

        System.out.println(vetor);
        System.out.println(vetor.contarOcorrencias("Elemento 1"));
    }
}
