package estrutura;

import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void empilhar(T elemento) {
        elementos.addFirst(elemento);
    }

    public T desempilhar() {
        return elementos.isEmpty() ? null : elementos.removeFirst();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public T topo() {
        return elementos.peekFirst();
    }
}
