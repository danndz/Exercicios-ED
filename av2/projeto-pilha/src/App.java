public class App {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo: " + pilha.peek());

        System.out.println("Removido: " + pilha.pop());
        System.out.println("Removido: " + pilha.pop());
        System.out.println("Removido: " + pilha.pop());
    }
}