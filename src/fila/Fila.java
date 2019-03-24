package fila;

import java.util.NoSuchElementException;

public class Fila implements TADFila {

    private final int vetor[];
    private int inicio, fim;

    public Fila(int tamanho) {
        vetor = new int[tamanho];
        inicio = fim = -1;
    }

    @Override
    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == vetor.length - 1;
    }

    @Override
    public int size() {
        return fim + 1;
    }

    @Override
    public void enqueue(int elemento) {
        if (!isFull()) {
            vetor[++fim] = elemento;
            if (inicio == -1)
                inicio++;
        }
    }

    @Override
    // O(n)
    public int dequeue() throws NoSuchElementException {
        if (!isEmpty())
            if (inicio == fim)
                inicio = fim = -1;
            else {
                int retorno = vetor[inicio];

                for (int i = inicio; i < fim; i++)
                    vetor[i] = vetor[i + 1];

                fim--;
                return retorno;
            }

        throw new NoSuchElementException();
    }

    @Override
    public int front() throws NoSuchElementException {
        if (!isEmpty()) {
            return vetor[inicio];
        }

        throw new NoSuchElementException();
    }
}
