public class Ligacao {
    private Elemento verticeOrigem;
    private Elemento verticeDestino;
    private int peso;

     /**
     * Construtor da classe Ligacao.
     * @param verticeOrigem O vértice de origem da ligação.
     * @param verticeDestino O vértice de destino da ligação.
     * @param peso O peso associado à ligação.
     */
    public Ligacao( Elemento verticeOrigem,Elemento verticeDestino, int peso) {
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
        this.peso = peso;
    }
    /**
     * Obtém o vértice de origem da ligação.
     * @return O vértice de origem.
     */
    public Elemento getVerticeOrigem() {
        return verticeOrigem;
    }
    /**
     * Obtém o vértice de destino da ligação.
     * @return O vértice de destino.
     */
    public Elemento getVerticeDestino() {
        return verticeDestino;
    }

     /**
     * Define o vértice de destino da ligação.
     * @param verticeDestino O novo vértice de destino.
     */
    public void setVerticeDestino(Elemento verticeDestino) {
        this.verticeDestino = verticeDestino;
    }
    
    /**
     * Obtém o peso associado à ligação.
     * @return O peso da ligação.
     */
    public int getPeso() {
        return peso;
    }
}
