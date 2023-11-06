import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Grafo {       
    private Map<String, Vertice> verticeMap ;

    private Map<Vertice, List<Aresta>> graph;
    
    public Grafo() {
        verticeMap = new HashMap<>();
        graph = new HashMap<>();
    }

    public Vertice addVertice(String newVertice) {
        if (verticeMap.containsKey(newVertice)) {
            return verticeMap.get(newVertice);
        }
        Vertice v = new Vertice(newVertice);
        verticeMap.put(newVertice, v);
        return v;
    }

    public void addAresta (Vertice origem, Vertice destino, int peso) {
        Aresta a = new Aresta(origem, destino, peso);
        if (graph.containsKey(origem)) {
            graph.get(origem).add(a);
        } else {
            List<Aresta> arestas = new ArrayList<>();
            arestas.add(a);
            graph.put(origem, arestas);
        }

    }

    public Map<Vertice, List<Aresta>> getGraph() {
        return graph;
    }
}
