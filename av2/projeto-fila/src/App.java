public class App {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro: " + fila.peek());

        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Removido: " + fila.dequeue());
        System.out.println("Removido: " + fila.dequeue());
    }
}
