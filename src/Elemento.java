import java.math.BigInteger;


public class Elemento{
    
    private String nome;
    private BigInteger numHidrogenios;
    private int numeroEntradas;
    /**
     * Construtor da classe Elemento.
     * @param nome O nome do elemento.
     */
    public Elemento(String nome){
        this.nome = nome;
        this.numeroEntradas = 0;
        this.numHidrogenios = BigInteger.ZERO;
    }
    /**
     * Obtém o nome do elemento.
     * @return O nome do elemento.
     */
    public String getNome(){
        return nome;
    }
    /**
     * Define o nome do elemento.
     * @param nome O novo nome do elemento.
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * Obtém a quantidade de hidrogênios associados ao elemento.
     * @return A quantidade de hidrogênios.
     */
    public BigInteger getNumHidrogenios(){
        return numHidrogenios;
    }
    /**
     * Define a quantidade de hidrogênios associados ao elemento.
     * @param numHidrogenios A nova quantidade de hidrogênios.
     */
    public void setNumHidrogenios(BigInteger numHidrogenios){
        this.numHidrogenios = numHidrogenios;
    }
    /**
     * Obtém o número de arestas de entrada associadas ao elemento.
     * @return O número de arestas de entrada.
     */
    public int getNumeroEntradas(){
        return numeroEntradas;
    }

     /**
     * Define o número de arestas de entrada associadas ao elemento.
     * @param numArestasChegam O novo número de arestas de entrada.
     */
    public void setNumeroEntradas(int numArestasChegam){
        this.numeroEntradas = numArestasChegam;
    }
   
    /**
     * Incrementa o número de arestas de entradas.
     */
    public void addEntrada(){
        this.numeroEntradas++;
    }
    /**
     * Adiciona uma quantidade específica de hidrogênios ao elemento.
     * @param numHidrogenios A quantidade de hidrogênios a ser adicionada.
     */
    public void addHidrogenio(BigInteger numHidrogenios){
        this.numHidrogenios = this.numHidrogenios.add(numHidrogenios);
    }
   
    
}