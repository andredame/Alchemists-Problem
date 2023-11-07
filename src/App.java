import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Grafo graph = new Grafo();
         
         String fileName = "JBCasos/caso0360.txt";
        fileName = "CohenCasos/casof360.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("->");
                String leftPart = parts[0].trim();
                String[] leftPartElements = leftPart.split("\\s+");
                String rightPart = parts[1].trim();
                String nomeDestino = rightPart.split("\\s+")[1];

                Elemento destino = graph.addVertice(nomeDestino);
                for (int i = 0; i < leftPartElements.length; i += 2) {
                    int quantidade = Integer.parseInt(leftPartElements[i]);
                    Elemento origem = graph.addVertice(leftPartElements[i + 1]);
                    graph.addAresta(origem, destino, quantidade);
                    graph.addVertice(nomeDestino).addEntrada();
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elemento origem = graph.addVertice("hidrogenio");
        Elemento destino = graph.addVertice("ouro");
        Executa(origem,destino,graph);

    }
    /**
     * Método para executar o algoritmo de busca em profundidade
     * @param origem Elemento origem 
     * @param destino Elemento destino
     * @param graph Grafo que contem somente as ligações dos elementos
     */
    public static void Executa(Elemento origem,Elemento destino,Grafo graph) {
        Stack<Elemento> pilha = fillStack(origem, graph);
        Map <Elemento, Integer > map = new HashMap<>();

        while (!pilha.isEmpty()) {
            Elemento v = pilha.pop();
            map.put(v, map.getOrDefault(v, 0) + 1);            
            List<Ligacao> arestas = graph.getGraph().get(v);
            
            if (arestas != null && v.getNumeroEntradas() == map.get(v)) { 
                for (Ligacao a : arestas) {
                    Elemento v2 = a.getVerticeDestino();
                    if (map.get(v2) != null) {
                        BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
                        v2.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()).add(v2.getNumHidrogenios()));
                    } else {
                        BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
                        v2.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()));
                    }
                    pilha.add(v2);
                }
            }
        }
        System.out.println(destino.getNumHidrogenios());
    }

    /**
     * Método para Preencher a pilha com os Elementos que saem do Elemento origem
     * @param base Elemento origem
     * @param graph Classe graph que contem as ligações dos elementos
     * @return Fila preenchida com os Elementos que saem do vertice origem
     */
    public static Stack<Elemento> fillStack (Elemento base, Grafo graph){
        Stack<Elemento> pilha = new Stack<>();
        List<Ligacao> vertices = graph.getGraph().get(base);
        for(Ligacao a : vertices){
            Elemento v = a.getVerticeDestino();
             BigInteger pesoAresta = new BigInteger(Integer.toString(a.getPeso()));
            v.setNumHidrogenios(pesoAresta.multiply(v.getNumHidrogenios()));
            pilha.add(v);
        }
        return pilha;
    }    
}
