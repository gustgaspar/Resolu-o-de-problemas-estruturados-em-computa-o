public class Pilha {
    public static void main(String[] args) {
        Pilha p1 = new Pilha(10);

        p1.Insere(10);
        p1.Imprime();
    }

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = 1;
        //this.dados[capacidade];
    }
           // Atributos //

    private int capacidade;
    private int topo;
    private int[] dados;


            // Métodos //

    public void Insere(int var){
        topo ++;
        dados[topo] = var;
    }

    public void cheia(){
        if (topo == capacidade){
            System.out.println("Está cheia!");
        } else {
            System.out.println("Não está cheia!");
        }
    }

    public void Vazia(){
        if (topo == -1){
            System.out.println("Está vazia!");
        } else {
            System.out.println("Não está vazia!");
        }
    }

    public void Remove(){
        int e;
        e = dados[topo];
        topo--;
    }

    public void Imprime(){
        if (topo == -1){
            System.out.println("Não há elementos na pilha.");
        } else {
        System.out.println(dados.length); }
    }
}
