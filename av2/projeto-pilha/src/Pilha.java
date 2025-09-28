class Pilha {
    int[] elementos;
    int top;

    Pilha(int tamanho) {
        elementos = new int[tamanho];
        top = -1;
    }

    void push(int valor) {
        top++;
        elementos[top] = valor;
    }

    int pop() {
        int valor = elementos[top];
        top--;
        return valor;
    }

    int peek() {
        return elementos[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
