import java.util.*;

class Solution {

    public static void dfs(ArrayList<ArrayList<Integer>> adjLs, int[] visited, int node) {

        visited[node] = 1;
        for (Integer it : adjLs.get(node)) {
            if (visited[it] == 0) {
                dfs(adjLs, visited, it);
            }
        }
    }

    public static int number_of_provinces(int arr[][], int V) {
        int visited[] = new int[V];
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(adjLs, visited, i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 0, 1 },
                { 0, 1, 0 },
                { 1, 0, 1 }
        };
        int V = 3;
        System.out.println(number_of_provinces(arr, V));

    }
}