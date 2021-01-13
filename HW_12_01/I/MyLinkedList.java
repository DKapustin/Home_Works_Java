package com.company;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    Node<E> head;
    @Override
    public void add(E element) {
        if (head !=null){
            Node current = head;
            while (current.getNextNode()!=null){
               current = current.getNextNode();
            }
            current.setNextNode(new Node(element));
        }
        else{
            head = new Node(element);
        }

    }

    @Override
    public void add(int index, E element) {
        if (head !=null){
            int count=0;
            Node current = head;
            while ((current.getNextNode()!=null)&&(count!=index)){
                current = current.getNextNode();
                count++;
            }
            Node newNode = new Node(element,current.getNextNode());
            current.setNextNode(newNode);
        }
        else{
            head = new Node(element);
        }
    }

    @Override
    public void clear() {
        int count = 0;
        while (count<this.size()){
            this.set(count,null);
            count++;
        }
    }


    public void clearAll() {
        while (head!=null){
            if (head.getNextNode()!=null){
                Node current = head.getNextNode();
                head.setNextNode(null);
                head = current;
            }
            else{
                head = null;
            }
        }
    }

    @Override
    public E get(int index) {
        int count =0;
        Node current = head;
        while(count != index){
            if (current.getNextNode()!=null) {
                current = current.getNextNode();
            }
            else {
                return null;
            }
            count++;
        }
        return (E) current.getElement();
    }

    @Override
    public int indexOf(E element) {
        int count =0;
        Node current = head;
        while(current.getElement()!=element){
            if (current.getNextNode()!=null) {
                current = current.getNextNode();
            }
            else {
                return -1;
            }
            count++;
        }
        return count;
    }

    @Override
    public E remove(int index) {
        int count =0;
        Node current = head;
        if (index == 0){
            Node buf = current;
            head = current.getNextNode();
            current.setNextNode(null);
            return head.getElement();
        }
        while(count != index-1){
            if (current.getNextNode()!=null) {
                current = current.getNextNode();
            }
            else {
                return null;
            }
            count++;
        }
        Node next = current.getNextNode();
        current.setNextNode(next.getNextNode());
        next.setNextNode(null);
        return (E) next.getElement();
    }

    @Override
    public E set(int index, E element) {
        if (head !=null){
            int count=0;
            Node current = head;
            while (count!=index){
                if (current.getNextNode()==null){
                    return null;
                }
                current = current.getNextNode();
                count++;
            }
           current.setElement(element);
        }
        else{
            head = new Node(element);
        }
        return element;
    }

    @Override
    public int size() {
        int count =1;
        Node current = head;
        if (head == null){return 0;}
        while(current.getNextNode()!=null){
            current=current.getNextNode();
            count++;
        }
        return count;
    }

    @Override
    public E[] toArray() {
        Object[] array =  new Object [this.size()];
        int count =0;
        while (count!=this.size()){
            E cur = (E)this.get(count);
            array[count]=cur;
            count++;
        }
        return (E[]) array;
    }

    public void print(){
        if(head==null){
            return;
        }
        Node current = head;
        while(current.getNextNode()!=null){
            System.out.println(current.getElement());
            current = current.getNextNode();
        }
        System.out.println(current.getElement());
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
                if (hasNext()){
                    E element = (E) current.getElement();
                    current = current.getNextNode();
                    return element;
                }
                return null;
            }
        };
    }
}