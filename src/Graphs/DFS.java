package Graphs;
import java.util.ArrayList;
public class DFS {
    public static void main(String[] args){

    }

    ArrayList<Integer> al = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V+1];
        DFSTraversal(adj,0, visited);
        return al;
    }

    public void DFSTraversal(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        visited[s] = true;
        al.add(s);

        for(int v : adj.get(s)){
            if(visited[v] == false){
                DFSTraversal(adj, v, visited);
            }
        }
    }
}
