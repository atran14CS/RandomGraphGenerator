import java.util.*;

public class RandomGraphGenerator {
    public static void main(String[] args) {
        int n = 10;
        double p = 0.2;

        ArrayList<ArrayList<Integer>> graph1 = createRandomGraphs(n, p);
        System.out.println("Graph 1:");
        printGraph(graph1);
    }


    public static ArrayList<ArrayList<Integer>> createRandomGraphs(int n, double p) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> vertex = new ArrayList<>();
            adjacencyList.add(vertex);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rand.nextDouble() < p) {
                    adjacencyList.get(i).add(j);
                    adjacencyList.get(j).add(i);
                }
            }
        }
        return adjacencyList;
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
