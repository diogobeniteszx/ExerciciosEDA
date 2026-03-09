public class TesteVetor3 {
    static void main() {
        //7. TesteVetor3
        //Chame ultimo() antes e depois de adicionar elementos, observando a exceção.

        Vetor vetor = new Vetor(3);

        try {
            System.out.println(vetor.ultimo());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        vetor.adiciona("Elemento 1");
        System.out.println(vetor);
        System.out.println(vetor.ultimo());

        vetor.adiciona("Elemento 2");

        vetor.adiciona("Elemento 3");
        System.out.println(vetor);
        System.out.println(vetor.ultimo());
    }
}
