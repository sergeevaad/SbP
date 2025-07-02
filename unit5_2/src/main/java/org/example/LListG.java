package org.example;

import java.util.NoSuchElementException;

public class LListG<T> {
    private Node<T> head;
    private int size;

    class Node<T>{
        Node<T> next;
        T val;

        public Node(T val){
            this.val=val;
        }
    }

    public void add(T val){
        Node<T> node = new Node<>(val);
        if (head==null){
            head = node;
        }else {
            Node<T> curNode = head;
            while (curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next = node;
        }
        size++;
    }

    public void add(int index, T val){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            addFirst(val);
        } else if (index == size) {
            add(val);
        } else {
            Node<T> node = new Node<>(val);
            Node<T> prev = head;

            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public void addFirst(T val){
        Node<T> node = new Node<>(val);
        node.next = head;
        head = node;
        size++;
    }

    public void remove(T val){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if (head.val.equals(val)) {
            head = head.next;
            size--;
        }

        Node<T> node = head;
        while (node.next != null) {
            if (node.next.val.equals(val)) {
                node.next = node.next.next;
                size--;
            }
            node = node.next;
        }
    }

    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            head = head.next;
            size--;
        }

        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    public void removeFirst(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node<T> node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        size--;
    }

    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void set(int index, T val){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.val=val;
    }

    public int size(){
        return size;
    }

    public boolean contains(T val){
        Node<T> node = head;
        while (node != null) {
            if (node.val.equals(val)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void clear(){
        head = null;
        size=0;
    }
}
