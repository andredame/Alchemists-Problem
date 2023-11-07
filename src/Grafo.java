import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Grafo {       
    private Map<String, Elemento> verticeMap ;

    private Map<Elemento, List<Ligacao>> graph;
    
    public Grafo() {
        verticeMap = new HashMap<>();
        graph = new HashMap<>();
    }

    public Elemento addVertice(String newVertice) {
        if (verticeMap.containsKey(newVertice)) {
            return verticeMap.get(newVertice);
        }
        Elemento v = new Elemento(newVertice);
        verticeMap.put(newVertice, v);
        return v;
    }

    public void addAresta (Elemento origem, Elemento destino, int peso) {
        Ligacao a = new Ligacao(origem, destino, peso);
        if (graph.containsKey(origem)) {
            graph.get(origem).add(a);
        } else {
            List<Ligacao> arestas = new ArrayList<>();
            arestas.add(a);
            graph.put(origem, arestas);
        }

    }

    public Map<Elemento, List<Ligacao>> getGraph() {
        return graph;
    }
}
