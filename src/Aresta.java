public class Aresta {
    private Vertice verticeOrigem;
    private Vertice verticeDestino;
    private int peso;

    public Aresta( Vertice verticeOrigem,Vertice verticeDestino, int peso) {
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
        this.peso = peso;
    }

    public Vertice getVerticeOrigem() {
        return verticeOrigem;
    }
    public Vertice getVerticeDestino() {
        return verticeDestino;
    }

    public void setVerticeDestino(Vertice verticeDestino) {
        this.verticeDestino = verticeDestino;
    }

    public int getPeso() {
        return peso;
    }
}
