package com.company;

public class Node<E> {
    private E element;
    private Node nextNode;
    public Node (E element){
        this.element = element;
        this.nextNode = null;
    }
    public Node(E element, Node nextNode){
        this.element = element;
        this.nextNode = nextNode;
    }
    public Node<E> getNextNode(){
        return this.nextNode;
    }
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    public E getElement(){
        return this.element;
    }
    public void setElement(E element){
        this.element = element;
    }
}
