public class Fila {
    public static void main(String[] args) {
        Fila f1 = new Fila(5);
        f1.insere(1);
        f1.insere(2);
        f1.insere(3);
        f1.imprime();
        f1.remove();
        f1.imprime();
    }

    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = 0;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return ((ultimo + 1) % capacidade == primeiro);
    }

    public boolean vazia() {
        return (primeiro == ultimo);
    }

    public void insere(int elemento) {
        if (this.cheia()) {
            System.out.println("ERRO! Fila cheia!");
            return;
        }
        this.dados[ultimo] = elemento;
        this.ultimo = (ultimo + 1) % this.capacidade;
    }

    public int remove() {
        if (this.vazia()) {
            System.out.println("ERRO! Fila vazia!");
            return -1; // Retorno de erro
        }
        int elemento = this.dados[primeiro];
        this.primeiro = (primeiro + 1) % this.capacidade;
        return elemento;
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("Elementos da fila: ");
        int i = primeiro;
        while (i != ultimo) {
            System.out.println(dados[i]);
            i = (i + 1) % capacidade;
        }
        System.out.println();
    }
}