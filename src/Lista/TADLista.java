package Lista;

public interface TADLista {

    public boolean isEmpty();

    //public boolean isFull();
    public int size();

    public void add(int elemento, int posicao);

    public int remove(int posicao);

    public int set(int elemento, int posicao);

    public int get(int posicao);
}
