import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Vertice{
    
    private String nome;
    private BigInteger numHidrogenios;
    private int numeroEntradas;
    private boolean visitado;
    private List <Aresta> arestas;

    public Vertice(String nome){
        this.nome = nome;
        this.numHidrogenios = new BigInteger("1");
        this.numeroEntradas = 0;
        this.visitado = false;
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
    public boolean getVisitado(){
        return visitado;
    }
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public void addEntrada(){
        this.numeroEntradas++;
    }
    public List<Aresta> getArestas(){
        return arestas;
    }
    
}