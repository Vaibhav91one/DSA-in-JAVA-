package Graphs;
import java.util.ArrayList;
import java.util.Arrays;

public class MotherVertex {
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        //making visited array
        int arr[] = new int[V];
        // lastnode is the mothervertex
        int lastNode = 0;

        //marking nodes visited if not visited
        for(int i = 0; i < V; i++){
            if(arr[i] == 0){
                dfs(adj, i, arr);
                //here last node will be 0 in case of 0->1->2->3;
                //because in this dfs recursion function we visit node 0 and then it adjacent and then adjacent of adjacent nodes of node 0;
                lastNode = i;
            }
        }

        //marking the lastnode 0
        // this is done in order to know that last node was having the direction which makes it unreachable
        Arrays.fill(arr,0);
        dfs(adj,lastNode, arr);

        // checking if every node was visited
        for(int x: arr){
            if(x == 0) return -1;
        }
        return lastNode;
    }

//here last node will be 0 in case of 0->1->2->3;
//    dfs recursion function we visit node 0 and then it adjacent and then adjacent of adjacent nodes of node 0;
    void dfs(ArrayList<ArrayList<Integer>> adj, int k , int[] arr){
        arr[k] = 1;
        for(int x : adj.get(k)){
            if(arr[x] == 0){
                dfs(adj,x,arr);
            }
        }
    }
}
