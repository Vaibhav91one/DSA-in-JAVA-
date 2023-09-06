package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUDesign {

    //Node for a doublyLinkedList
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.val = val;
            this.key = key;
        }

    }

    //A doubly linked list implementation with 2 dummy nodes at the head and tail of the linkedlist
    class LinkedNodeList{
        Node dummyhead;
        Node dummytail;

        LinkedNodeList(){
            dummyhead = new Node(0,0);
            dummytail = new Node(0,0);
//            dummy head -> dummytail;
            dummyhead.next = dummytail;
//            dummytail<-dummy head;
            dummytail.prev = dummyhead;
        }

//        storing and removing the node needed to be moved to the starting
        void moveToHead(Node node){
           node.prev.next = node.next;
           node.next.prev = node.prev;
           addToHead(node);
        }

//        adding the node to the start of the linked list next to dummy head;
        void addToHead(Node node){
            Node tmp = dummyhead.next;
            dummyhead.next = node;
            node.next = tmp;
            node.prev = dummyhead;
            tmp.prev = node;
        }

//        removing the last node by making the second last node equal to the dummy tail

        void RemoveTail(){
            Node newTail = dummytail.prev.prev;
            newTail.next = dummytail;
            dummytail.prev = newTail;
        }

//      returning the last node before dummy tail
        Node getTail(){
            return dummytail.prev;
        }
    }
    class LRUCache {
       LinkedNodeList list;
       Map<Integer, Node> map;
       Integer cap;

//       initializing a doubly linkedList, a hashmap of given capacity
        public LRUCache(int capacity) {
         list = new LinkedNodeList();
         map = new HashMap<>(capacity);
         cap = capacity;
        }

//      get the node from the linked-list, and move it to the head
        public int get(int key) {
            Node node = map.get(key);
            if(node == null){
                return -1;
            }
            list.moveToHead(node);
            return node.val;
        }

        public void put(int key, int value) {
            //moving the node to the head as it is recently used
         Node node = map.get(key);
         if(node != null){
             list.moveToHead(node);
             node.val = value;
         }
         else{
             //creating new node
             Node newNode = new Node(key,value);
             //checking if the capacity is full or not/ if cache is full
             if(map.size() == cap){
                 //removing the tail from hashtable and linkedlist
                 Node tail = list.getTail();
                 map.remove(tail.key);
                 list.RemoveTail();
             }
             //adding the new node to the hashmap and to the head of the linkedlist
             map.put(key,newNode);
             list.addToHead(newNode);
         }
        }
    }
}
