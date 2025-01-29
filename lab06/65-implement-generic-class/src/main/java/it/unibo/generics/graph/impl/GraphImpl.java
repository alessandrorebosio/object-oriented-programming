package it.unibo.generics.graph.impl;

import it.unibo.generics.graph.api.Graph;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of {@link Graph} only storing explicitly defined arcs.
 * It is the ideal choice when handling poorly connected graphs.
 *
 * @param <N> the type of the nodes of the graph
 */
public final class GraphImpl<N> implements Graph<N> {

    private final Map<N, Set<N>> edges = new LinkedHashMap<>();

    @Override
    public void addEdge(final N source, final N target) {
        if (nodesExist(source, target)) {
            edges.get(source).add(target);
        }
    }

    @Override
    public void addNode(final N node) {
        edges.putIfAbsent(node, new HashSet<>());
    }

    @SafeVarargs
    private boolean nodesExist(final N... nodes) {
        for (final N node : nodes) {
            if (!edges.containsKey(node)) {
                throw new IllegalArgumentException("No such node: " + node);
            }
        }
        return true;
    }

    @Override
    public List<N> getPath(final N source, final N target) {
        if (source.equals(target)) {
            return List.of(source); // Se source è uguale a target, il cammino è triviale
        }

        if (nodesExist(source, target)) {
            final Set<N> visited = new HashSet<>();
            final LinkedList<N> path = new LinkedList<>();
            if (dfs(source, target, visited, path)) {
                return path;
            }
        }

        return Collections.emptyList(); // Se non si trova il cammino
    }

    private boolean dfs(final N current, final N target, final Set<N> visited, final LinkedList<N> path) {
        visited.add(current);
        path.add(current);

        if (current.equals(target)) {
            return true; // Se raggiungiamo il target, restituiamo true
        }

        // Esplora i nodi adiacenti
        for (final N neighbor : linkedNodes(current)) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, target, visited, path)) {
                    return true; // Se troviamo un cammino, restituiamo true
                }
            }
        }

        // Se non si trova il cammino, rimuoviamo il nodo corrente dal percorso e
        // torniamo indietro
        path.removeLast();
        return false;
    }

    @Override
    public Set<N> linkedNodes(final N node) {
        return edges.get(node);
    }

    @Override
    public Set<N> nodeSet() {
        return new HashSet<>(edges.keySet());
    }

}