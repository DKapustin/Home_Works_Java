package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i=0;i<10000;i++){
            myLinkedList.add(i);
            linkedList.add(i);
            arrayList.add(i);
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
            hashMap.put(i,i);
            linkedHashMap.put(i,i);
            treeMap.put(i,i);
        }
        System.out.println("Compare lists : \n");
        System.out.println("Add end time : ");
        long start = System.nanoTime();
        myLinkedList.add(10000);
        System.out.println("myLinkedList : "+(System.nanoTime() - start) +" ms");

        start = System.nanoTime();
        linkedList.add(10000);
        System.out.println("linkedList : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        arrayList.add(10000);
        System.out.println("arrayList : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Add mid time : ");

        start = System.nanoTime();
        myLinkedList.add(5000,5000);
        System.out.println("myLinkedList : "+(System.nanoTime() - start) +" ms");

        start = System.nanoTime();
        linkedList.add(5000,5000);
        System.out.println("linkedList : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        arrayList.add(5000,5000);
        System.out.println("arrayList : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Get time : ");

        start = System.nanoTime();
        myLinkedList.get(5000);
        System.out.println("myLinkedList : "+(System.nanoTime() - start) +" ms");

        start = System.nanoTime();
        linkedList.get(5000);
        System.out.println("linkedList : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        arrayList.get(5000);
        System.out.println("arrayList : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Remove time : ");

        start = System.nanoTime();
        myLinkedList.remove(5000);
        System.out.println("myLinkedList : "+(System.nanoTime() - start) +" ms");

        start = System.nanoTime();
        linkedList.remove(5000);
        System.out.println("linkedList : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        arrayList.remove(5000);
        System.out.println("arrayList : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Compare sets : \n");
        System.out.println("Add time : ");

        start = System.nanoTime();
        hashSet.add(10000);
        System.out.println("hashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashSet.add(10000);
        System.out.println("linkedHashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeSet.add(10000);
        System.out.println("treeSet : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Remove time : ");

        start = System.nanoTime();
        hashSet.remove(5000);
        System.out.println("hashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashSet.remove(5000);
        System.out.println("linkedHashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeSet.remove(5000);
        System.out.println("treeSet : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Contains time : ");

        start = System.nanoTime();
        hashSet.contains(5000);
        System.out.println("hashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashSet.contains(5000);
        System.out.println("linkedHashSet : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeSet.contains(5000);
        System.out.println("treeSet : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Compare maps : \n");
        System.out.println("Put time : ");

        start = System.nanoTime();
        hashMap.put(5000,5000);
        System.out.println("hashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashMap.put(5000,5000);
        System.out.println("linkedHashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeMap.put(5000,5000);
        System.out.println("treeMap : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Remove time : ");

        start = System.nanoTime();
        hashMap.remove(5000);
        System.out.println("hashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashMap.remove(5000);
        System.out.println("linkedHashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeMap.remove(5000);
        System.out.println("treeMap : "+(System.nanoTime() - start)+" ms\n");

        System.out.println("Get time : ");

        start = System.nanoTime();
        hashMap.get(4999);
        System.out.println("hashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        linkedHashMap.get(4999);
        System.out.println("linkedHashMap : "+(System.nanoTime() - start)+" ms");

        start = System.nanoTime();
        treeMap.get(4999);
        System.out.println("treeMap : "+(System.nanoTime() - start)+" ms\n");
    }
}
