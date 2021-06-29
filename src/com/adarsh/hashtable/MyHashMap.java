package com.adarsh.hashtable;
public class MyHashMap<K, V> {
    //Called linked list to do the Hash Table Operation

    MyLinkedList<K> myList;

    public void MyHashmap() {
        this.myList = new MyLinkedList<>();
    }

    //Getting and Adding values
    public V get(K Key) {
        MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(Key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(key);
        if (mapNode == null) {
            mapNode = new MyHashMapNode<>(key, value);
            this.myList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }

    }

    @Override
    public String toString() {
        return "MyHashMapNodes{ "+myList+" }";
    }
}