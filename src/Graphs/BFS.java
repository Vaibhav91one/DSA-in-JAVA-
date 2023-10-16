package Graphs;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    ArrayList<Integer> al = new ArrayList<>();
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        BFSTraversal(adj, V, 0, visited);
        return al;
    }

    public void BFSTraversal(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()){
            int u = q.poll();
            al.add(u);

            for(int v: adj.get(u)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }





}
