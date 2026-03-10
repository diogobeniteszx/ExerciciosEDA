public class TesteVetor1 {
    static void main() {
        //5. TesteVetor1
        //Crie um vetor, adicione 3 elementos, imprima o tamanho, o vetor e os elementos um por linha.

        Vetor vetor = new Vetor(3);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
        vetor.imprimeUmPorLinha();
    }
}
