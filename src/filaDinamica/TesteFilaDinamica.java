package filaDinamica;

public class TesteFilaDinamica {

    public static void main(String[] args) {
        FilaDinamica filaD = new FilaDinamica();

        filaD.enqueue(5);
        filaD.enqueue(10);
        filaD.enqueue(20);

        System.out.println(filaD.dequeue());
    }
}
