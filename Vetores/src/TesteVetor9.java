public class TesteVetor9 {
    static void main() {
        //13B. TesteVetor9
        //Testar com repetidos, ex.: A, B, C, B, D, B.

        Vetor vetor = new Vetor(6);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");
        System.out.println(vetor);

        System.out.println(vetor.indiceUltimo("B"));
    }
}
