class Fila {
    int[] elementos;
    int inicio;
    int fim;

    Fila(int tamanho) {
        elementos = new int[tamanho];
        inicio = 0;  
        fim = 0;     
    }

    void enqueue(int valor) {
        elementos[fim] = valor;
        fim++;
    }

    int dequeue() {
        int valor = elementos[inicio];
        inicio++;
        return valor;
    }

    int peek() {
        return elementos[inicio];
    }

    boolean isEmpty() {
        return inicio == fim;
    }
}
