import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Grafo graph = new Grafo();
        Map<String, Vertice> verticeMap = new HashMap<>();
        // String fileName = "caso0020.txt";
        // String fileName = "JBCasos/casof180.txt";
         String fileName = "CohenCasos/casof360.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("->");

                
                String leftPart = parts[0].trim();
                String[] leftPartElements = leftPart.split("\\s+");

                String rightPart = parts[1].trim();
                String targetName = rightPart.split("\\s+")[1];
                

                Vertice target = graph.addVertice(targetName);
                for (int i = 0; i < leftPartElements.length; i += 2) {
                    int quantidade = Integer.parseInt(leftPartElements[i]);
                    String sourceName = leftPartElements[i + 1];

                    Vertice source = graph.addVertice(sourceName);
                    graph.addAresta(source, target, quantidade);
                    graph.addVertice(targetName).addEntrada();
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Vertice base = graph.addVertice("hidrogenio");
        Vertice destino = graph.addVertice("ouro");
        Executa(base,destino,graph);
        System.out.print(destino.getNumHidrogenios()  );

    }
    public static void Executa(Vertice base, Vertice destino,Grafo graph) {
        Stack<Vertice> pilha = fillStack(base, graph);
        Map <Vertice, Integer > map = new HashMap<>();
        while (!pilha.isEmpty()) {
            Vertice v = pilha.pop();
            map.put(v, map.getOrDefault(v, 0) + 1);            
            List<Aresta> arestas = graph.getGraph().get(v);
            
            if (arestas != null && v.getNumeroEntradas() == map.get(v)) { 
                for (Aresta a : arestas) {
                    Vertice v2 = a.getVerticeDestino();
                    if (v2.getVisitado()) {
                        BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
                        v2.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()).add(v2.getNumHidrogenios()));
                    } else {
                        BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
                        v2.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()));
                        v2.setVisitado(true);
                    }
                    pilha.add(v2);
                }
            }
        }
    }

    public static Stack<Vertice> fillStack (Vertice source, Grafo graph){
        Stack<Vertice> pilha = new Stack<>();
        List<Aresta> vertices = graph.getGraph().get(source);
        for(Aresta a : vertices){
            Vertice v = a.getVerticeDestino();
             BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
            v.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()));
            v.setVisitado(true);
            pilha.add(v);
        }
        return pilha;
    }    
}
