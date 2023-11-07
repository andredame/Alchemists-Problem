import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Elemento{
    
    private String nome;
    private BigInteger numHidrogenios;
    private int numeroEntradas;
    private List <Ligacao> arestas;

    public Elemento(String nome){
        this.nome = nome;
        this.numHidrogenios = new BigInteger("1");
        this.numeroEntradas = 0;
        arestas = new ArrayList<>();
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
    public List<Ligacao> getArestas(){
        return arestas;
    }
    
}