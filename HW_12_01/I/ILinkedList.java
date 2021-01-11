package com.company;

public interface ILinkedList<E> extends java.lang.Iterable<E>{
    public void add(E element);
    public void add(int index,E element);
    public void claer();
    public E get(int index);
    public int indexOf(E element);
    public E remove(int index);
    public E set(int index, E element);
    public int size();
    public E[] toArray();
    public String toString();
}
