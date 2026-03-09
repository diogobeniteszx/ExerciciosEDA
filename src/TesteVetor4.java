public class TesteVetor4 {
    static void main() {
        //8B. TesteVetor4 — Testar limpar()
        //Crie um vetor, adicione elementos, imprima antes e depois de limpar().

        Vetor vetor = new Vetor(3);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.imprimeUmPorLinha();

        vetor.limpar();
        vetor.imprimeUmPorLinha();
    }
}
