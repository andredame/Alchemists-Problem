import java.math.BigInteger;


public class Elemento{
    
    private String nome;
    private BigInteger numHidrogenios;
    private int numeroEntradas;
    public Elemento(String nome){
        this.nome = nome;
        this.numeroEntradas = 0;
        this.numHidrogenios = BigInteger.ZERO;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public BigInteger getNumHidrogenios(){
        return numHidrogenios;
    }
    public void setNumHidrogenios(BigInteger numHidrogenios){
        this.numHidrogenios = numHidrogenios;
    }
    public int getNumeroEntradas(){
        return numeroEntradas;
    }
    public void setNumeroEntradas(int numArestasChegam){
        this.numeroEntradas = numArestasChegam;
    }
   
    public void addEntrada(){
        this.numeroEntradas++;
    }
    public void addHidrogenio(BigInteger numHidrogenios){
        this.numHidrogenios = this.numHidrogenios.add(numHidrogenios);
    }
   
    
}