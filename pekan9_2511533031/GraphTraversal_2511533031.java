package pekan9_2511533031;
import java.util.*;
public class GraphTraversal_2511533031 {
	private Map<String, List<String>> graph_3031 = new HashMap<>();
	
	//Menambahkan edge (graf tak berarah)
	public void addEdge(String node1, String node2) {
		graph_3031.putIfAbsent(node1, new ArrayList<>());
		graph_3031.putIfAbsent(node2, new ArrayList<>());
		graph_3031.get(node1).add(node2);
		graph_3031.get(node2).add(node1);
	}
	// Menampilkan graf awal
	public void printGraph_3031() {
		System.out.println("Graf Awal (adjacency List):");
		for (String node_3031 : graph_3031.keySet()) {
			System.out.print(node_3031 + " -> ");
			List<String> neighbors_3031 = graph_3031.get(node_3031);
			System.out.println(String.join(", ", neighbors_3031));
		}
		System.out.println();
	}
	// DFS rekursi
	public void dfs_3031(String start_3031) {
		Set<String> visited_3031 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_3031(start_3031, visited_3031);
		System.out.println();
	}
	private void dfsHelper_3031(String current_3031, Set<String> visited) {
		if (visited.contains(current_3031)) return;
		visited.add(current_3031);
		System.out.print(current_3031 + " ");
		for (String neighbor_3031 : graph_3031.getOrDefault(current_3031, new ArrayList<>())) {
			dfsHelper_3031(neighbor_3031, visited);
		}
	}
		// BFS Iteratif
		public void bfs_3031(String start) {
		    Set<String> visited_3031 = new HashSet<>();
		    Queue<String> queue_3031 = new LinkedList<>();

		    queue_3031.add(start);
		    visited_3031.add(start);
		    System.out.println("Penelusuran BFS:");
		    while (!queue_3031.isEmpty()) {
		        String current_3031 = queue_3031.poll();
		        System.out.print(current_3031 + " ");
		        for (String neighbor_3031 : graph_3031.getOrDefault(current_3031, new ArrayList<>())) {
		            if (!visited_3031.contains(neighbor_3031)) {
		                queue_3031.add(neighbor_3031);
		                visited_3031.add(neighbor_3031);
		            }
		        }
		    }
		    System.out.println();
		}
		// Main
		public static void main(String[] args) {
		    GraphTraversal_2511533031 graph_3031 = new GraphTraversal_2511533031();
		    // Contoh graf: A-B, A-C, B-D, B-E
		    graph_3031.addEdge("A", "B");
		    graph_3031.addEdge("A", "C");
		    graph_3031.addEdge("B", "D");
		    graph_3031.addEdge("B", "E");
		    // Cetak graf awal
		    System.out.println("Graf Awal adalah: ");
		    graph_3031.printGraph_3031();
		    // Lakukan penelusuran
		    graph_3031.dfs_3031("A");
		    graph_3031.bfs_3031("A");
		}
	}
