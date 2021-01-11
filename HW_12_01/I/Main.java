package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<String>();
        mll.add("java");
        mll.add("sql");
        mll.remove(0);
        System.out.println(mll.size());
        mll.print();
        System.out.println(mll.get(1));
        Object []arr = mll.toArray();
        for(int i=0;i!=arr.length;i++){
            System.out.println(arr[i]);
        }

        mll.claer();
        mll.print();

    }
}