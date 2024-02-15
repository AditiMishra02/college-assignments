import java.util.*;
// traverse a graph using breadth first search (use ArrayDeque collection)
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges");
        int m = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the edge");
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        System.out.println("Enter the starting vertex");
        int start = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<Integer>();
        boolean[] visited = new boolean[n];
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");
            for (int i = 0; i < n; i++) {
                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}