package fila;

import java.util.NoSuchElementException;

public class FilaCircular implements TADFila {
    private final int vetor[];
    private int inicio, fim, qtd;

    public FilaCircular(int tamanho){
        vetor = new int[tamanho];
        inicio = fim = qtd = 0;
    }

    @Override
    public boolean isEmpty(){
        return qtd == 0;
    }

    public boolean isFull(){
        return qtd == vetor.length;
    }

    @Override
    public int size(){
        return qtd + 1;
    }

    @Override
    public void enqueue(int elemento){
        if(!isFull()){
            vetor[fim] = elemento;
            qtd++;

            // if(fim == vetor.length)
            //     fim = 0;
            fim = (fim + 1) % vetor.length;
        }
    }

    // O(1)
    @Override
    public int dequeue() throws NoSuchElementException {
        if(!isEmpty()){
            int elem = vetor[inicio];
            qtd--;

            // if(inicio == vetor.length)
            //     inicio = 0;
            inicio = (inicio + 1) % vetor.length;

            return elem;
        }

        throw new NoSuchElementException();
    }

    @Override
    public int front() throws NoSuchElementException {
        if(!isEmpty())
            return vetor[inicio];

        throw new NoSuchElementException();
    }
}