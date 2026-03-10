public class TestePilha1 {
    static void main() {
        Pilha<String> pilha = new Pilha<>(5);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println(pilha.topo());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.topo());

        pilha.empilha("C");
        System.out.println(pilha);
    }
}
