public class TesteVetor2 {
    static void main() {
        //6. TesteVetor2
        //Crie um vetor com 10 posições, adicione 4 elementos, teste busca(String) e contem(String).

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        System.out.println(vetor);

        System.out.println(vetor.busca("Elemento 3"));
        System.out.println(vetor.busca("Elemento 5"));

        System.out.println(vetor.contem("Elemento 3"));
        System.out.println(vetor.contem("Elemento 5"));
    }
}
