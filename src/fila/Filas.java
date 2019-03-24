package fila;

import java.util.NoSuchElementException;

public class Filas {

    public static void main(String[] args) {
        FilaCircular fc = new FilaCircular(5);

        System.out.println("Fila vazia: " + fc.isEmpty());

        try {
            fc.enqueue(4);
            fc.enqueue(1);
            fc.enqueue(6);
            fc.dequeue();
            fc.enqueue(3);
            fc.enqueue(8);
            
            fc.dequeue();

            fc.enqueue(12);
            
            fc.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Front: " + fc.front());
        System.out.println("Fila vazia: " + fc.isEmpty());
        System.out.println("Fila cheia: " + fc.isFull());
    }

}
