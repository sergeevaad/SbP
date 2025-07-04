package org.example;

import java.util.NoSuchElementException;

public class LList {
    private Node head;
    private int size;

    class Node{
        Node next;
        Object val;

        public Node(Object val){
            this.val=val;
        }
    }

    public void add(Object val){
        Node node = new Node(val);
        if (head==null){
            head = node;
        }else {
            Node curNode = head;
            while (curNode.next!=null){
                curNode = curNode.next;
            }
            curNode.next = node;
        }
        size++;
    }

    public void add(int index, Object val){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            addFirst(val);
        } else if (index == size) {
            add(val);
        } else {
            Node node = new Node(val);
            Node prev = head;

            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public void addFirst(Object val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void remove(Object val){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if (head.val.equals(val)) {
            head = head.next;
            size--;
        }

        Node node = head;
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

        Node node = head;
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
        Node node = head;
        if (node.next==null){
            removeFirst();
        }else {
        while (node.next.next != null) {
            node = node.next;
        }
        }
        node.next = null;
        size--;
    }

    public Object get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void set(int index, Object val){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.val=val;
    }

    public int size(){
        return size;
    }

    public boolean contains(Object val){
        Node node = head;
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
