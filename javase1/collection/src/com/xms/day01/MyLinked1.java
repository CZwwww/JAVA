package com.xms.day01;

/**
 * @author czw
 * @create 2021-06-16-上午 11:48
 */
public class MyLinked1<E> {
    Node<E> node;
    Node<E> first;
    int size;
   class Node<E>{
        E e;
        Node<E> pre;
        Node<E> next;
    }
    boolean add(E e){
       if(first==null){
           first = new Node<E>();
           first.next = first;
           first.pre = first;
           size++;
       }
       node = new Node<E>();
       node.pre = first.pre;
       node.next = first;
       first.pre.next = node;
       first.pre = node;
       return true;
    }
    boolean remove(E e){
       Node x = first;
       do{
           if(x.e==e){
           x.pre.next = x.next;
           x.next.pre = x.pre;
           if(x==first){
               first = first.next;
           }
           return true;
           }

       } while(x!=first);
       return false;
    }

}
