package filaDinamica;

import fila.TADFila;
import java.util.NoSuchElementException;

public class FilaDinamica implements TADFila {

    private Node inicio, fim = null;
    private int qtd = 0;

    @Override
    public boolean isEmpty() {
        return qtd == 0;
    }

    @Override
    public int size() {
        return qtd;
    }

    @Override
    public void enqueue(int elemento) {
        Node newNode = new Node(elemento);

        if (!isEmpty()) {
            fim.prox = newNode;
        } else {
            inicio = newNode;
        }

        fim = newNode;
        qtd++;
    }

    @Override
    public int dequeue() throws NoSuchElementException {
        if (!isEmpty()) {
            Node aux = inicio;
            inicio = inicio.prox;
            aux.prox = null;
            qtd--;
            if (inicio == null)
                fim = null;
                
            return aux.elemento;
        }

        throw new NoSuchElementException();
    }

    @Override
    public int front() throws NoSuchElementException {
        if (!isEmpty()) {
            return inicio.elemento;
        }

        throw new NoSuchElementException();
    }
}
