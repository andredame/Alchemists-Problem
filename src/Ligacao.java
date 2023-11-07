public class Ligacao {
    private Elemento verticeOrigem;
    private Elemento verticeDestino;
    private int peso;

    public Ligacao( Elemento verticeOrigem,Elemento verticeDestino, int peso) {
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
        this.peso = peso;
    }

    public Elemento getVerticeOrigem() {
        return verticeOrigem;
    }
    public Elemento getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Elemento verticeDestino) {
        this.verticeDestino = verticeDestino;
    }

    public int getPeso() {
        return peso;
    }
}
