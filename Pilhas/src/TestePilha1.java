public class TestePilha1 {
    static void main() {
        //2. Testando a pilha
        //Crie um programa que:
        //1. empilhe "A"
        //2. empilhe "B"
        //3. empilhe "C"
        //4. mostre o elemento do topo
        //5. desempilhe um elemento
        //6. mostre novamente o topo
        //Exemplo de saída esperada:
        //Topo: C
        //Removido: C
        //Topo: B

        Pilha<String> pilha = new Pilha<>(5);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println(pilha.topo());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.topo());

        //3. Mostrar elementos da pilha
        //Sobrescreva o método toString() da classe Pilha para exibir os elementos no formato:
        //[A, B, C]

        pilha.empilha("C");
        System.out.println(pilha);
    }
}
