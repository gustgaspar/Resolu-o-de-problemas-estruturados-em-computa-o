public class Pilha{
    public static void main(String[] args) {
        Pilha p1 = new Pilha(5);
    }

    // Contrutror
    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    // atributos
    private int capacidade;
    private int topo;
    private int[] dados;

    //metodos

    public void Insere(int elemento){
        if (this.cheia()){
            System.out.println("ERRO: Pilha cheia!");
        } else {
            topo++;
            dados[topo] = elemento;
        }
    }

    public boolean cheia(){
        return (topo == capacidade - 1);
    }

    public boolean Vazia(){
        return (topo == -1);
    }

    public int Remove(){
        if (this.Vazia()){
            System.out.println("Pilha vazia!");
        }
            int elemento = dados[topo];
            topo--;
        return elemento;
    }

    public void Imprime(){
        if (this.Vazia()) {
            System.out.println("ERRO: Pilha vazia!");
        }
        else {
            System.out.println("Elemento no topo: " + dados[topo]);
            System.out.println("Todos os elementos na pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.println(dados[i]);
            }
        }
    }
}