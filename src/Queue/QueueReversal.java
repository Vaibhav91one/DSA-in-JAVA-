package Queue;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args){

    }

    public Queue<Integer> rev(Queue<Integer> q){
        if(q.isEmpty())
            return q;

        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            int elemQueue = q.poll();
            s.push(elemQueue);
        }

        while(!s.empty()){
            int elemStack = s.pop();
            q.offer(elemStack);
        }

        return q;
    }
}
