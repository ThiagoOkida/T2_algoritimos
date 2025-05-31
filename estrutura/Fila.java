package estrutura;

import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void enfileirar(T elemento) {
        elementos.addLast(elemento);
    }

    public T desenfileirar() {
        return elementos.isEmpty() ? null : elementos.removeFirst();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public T espiar() {
        return elementos.peekFirst();
    }
}
