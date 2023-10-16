package Heap;

public class MedianInDataStream {
    private PriorityQueue<Integer> MaxHeap = null;
    private PriorityQueue<Integer> MinHeap = null;

    public MedianFinder() {
        MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        MinHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        MaxHeap.offer(num);
        MinHeap.offer(MaxHeap.poll());

        if(MaxHeap.size() < MinHeap.size()){
            MaxHeap.offer(MinHeap.poll());
        }
    }

    public double findMedian() {
        if(MaxHeap.size() == MinHeap.size()){
            return  (double) (MaxHeap.peek() + MinHeap.peek()) / 2.0;
        }
        else{
            return MaxHeap.peek();
        }
    }
}
