   /*public class LRUCache {
    
 //define a double linkedlist to represent the data.
    private class Node {
        int key;
        int value;
        Node pre;
        Node next;
    }
    
    int capacity;
    Node head, tail;
    Map<Integer, Node> cache;
    
    private void addNode(Node node) {
        node.next = head.next;
        head.next.pre = node;
        node.pre = head;
        head.next = node;
    }
    
    private void moveToHead(Node node) {
        removeNode(node);
        addNode(node);
    }
    
    // remove a node that is not tail.
    private void removeNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
    }

    private void removeTail() {
        tail = tail.pre;
        tail.next =null;
    }
    
    
    public LRUCache(int capacity) {
        this.cache = new HashMap<Integer, Node>();
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        head.pre = null;
        tail.pre = head;
        tail.next = null;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)) return -1; // time complexity O(1)
        moveToHead(cache.get(key));
        return cache.get(key).value;
        
    }
    
    public void set(int key, int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.key = key;
        addNode(newNode);
        if(cache.containsKey(key)){
            removeNode(cache.get(key));
        }
        cache.put(key,newNode);
        if(cache.size() == capacity+1) {
           removeTail();
           cache.remove(tail.key);
        }
    }
}*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedCappedHashMap<>(capacity);
    }

    public int get(int key) {
        if(!map.containsKey(key)) { return -1; }
        return map.get(key);
    }

    public void set(int key, int value) {
        map.put(key,value);
    }

    private static class LinkedCappedHashMap<K,V> extends LinkedHashMap<K,V> {

        int maximumCapacity;

        LinkedCappedHashMap(int maximumCapacity) {
            super(16, 0.75f, true);
            this.maximumCapacity = maximumCapacity;
        }

        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > maximumCapacity;
        }
    }
}
