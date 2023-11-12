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
    /**
     * Adiciona um novo elemento (vértice) ao grafo. Se o elemento já existe, retorna o elemento existente.
     * @param novoVertice O nome do novo elemento a ser adicionado.
     * @return O objeto Elemento correspondente ao novo elemento.
     */
    public Elemento addVertice(String novoVertice) {
        if (verticeMap.containsKey(novoVertice)) {
            return verticeMap.get(novoVertice);
        }
        Elemento v = new Elemento(novoVertice);
        verticeMap.put(novoVertice, v);
        return v;
    }
    /**
     * Adiciona uma nova aresta ponderada ao grafo.
     * @param origem O elemento de origem da aresta.
     * @param destino O elemento de destino da aresta.
     * @param peso O peso associado à aresta.
     */ 
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
    /**
     * Obtém o mapa que representa o grafo.
     * @return O mapa que mapeia cada elemento para a lista de ligações associadas a esse elemento.
     */
    public Map<Elemento, List<Ligacao>> getGraph() {
        return graph;
    }
}
