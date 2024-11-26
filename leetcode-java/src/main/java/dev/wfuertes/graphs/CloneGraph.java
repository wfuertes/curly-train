package dev.wfuertes.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/clone-graph/description/
 */
public class CloneGraph {
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        var visited = new HashMap<Integer, Node>();
        return cloneGraphHelper(node, visited);
    }

    private Node cloneGraphHelper(Node node, Map<Integer, Node> visited) {
        if (node == null) return node;

        if (visited.containsKey(node.val)) {
            return visited.get(node.val);
        }

        var clone = new Node(node.val);
        visited.put(node.val, clone);

        for (var neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraphHelper(neighbor, visited));
        }

        return clone;
    }
}
