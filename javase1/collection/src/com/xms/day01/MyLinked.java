package com.xms.day01;

/**
 * 写一个类MyLinked，实现双向循环链表的操作
 * Node head(链表的头)
 * size(元素个数)
 *
 * boolean add(E e)
 * boolean remove(E e)
 * int size()
 *
 * Node(节点,内部类)
 * 	element(元素)
 * 	next(下一个节点)
 * 	prev(上一个节点)

 * @author czw
 * @create 2021-06-11-下午 2:06
 */
public class MyLinked<E> {
    private Node<E> head;//链表头
    private Node<E> first;//链表元素首位
    private Node<E> last;//链表元素末尾
    private int size;//链表长度
    private static class Node<E> {//节点类
        E item;//节点内存放元素
        Node<E> prev;//前一节点的引用
        Node<E> next;//后一节点的引用

        Node(E item, Node<E> prev, Node<E> next) {//节点构造器
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
    public MyLinked() {//链表构造器
        head = new Node<>(null, null, null);
        size++;
    }
    private void linkLast(E e){//在链表末端添加节点
        if(size==1){
           createFirstNode(e);
           size++;
           return;
        }
        Node<E> newLast = new Node<>(e, last, head);
        last.next = newLast;
        last = newLast;
        size++;
    }

    private void createFirstNode(E e) {//添加第一个节点
        Node<E> newNode = new Node<>(e,head,head);
        head.next = newNode;
        head.prev = newNode;
        last = newNode;
        first = newNode;
        size++;
    }

//    public void linkFirst(E e){//在链表前端添加节点
//        Node<E> newFirst = new Node<>(e, head, first);
//        first.prev = newFirst;
//        first = newFirst;
//        size++;
//    }
    public boolean add(E e) {//添加元素的方法
        linkLast(e);
        return true;
    }
    private void unLink(Node<E> x){//将链表某节点删除
        if(size == 2){//size==2时链表中只有一个节点,直接将表头链接置空
            nodeToNull(head);
            return;
        }
        if(x.next!=head&&x.prev!=head){//如果该节点不是链表两端
            x.prev.next = x.next;
            x.next.prev = x.prev;
            nodeToNull(x);
            return;
        }
        if(x.prev!=head){//如果该节点是链表末尾
            x.prev.next = head;
            head.prev = x.prev;
            nodeToNull(x);
            return;
        }
        if(x.next!=head){//如果该节点是链表头
            x.next.prev = head;
            head.next = x.next;
            nodeToNull(x);
        }
    }
    public boolean remove(E e) {//对外提供的根据元素值删除方法
        Node<E> target = getNodeByElements(e);
        if(target!=null) {
            unLink(target);
            size--;//调用unlink方法成功后将链表长度-1
            return true;
        }
        return false;
    }
    private Node<E> getNodeByElements(E e){//根据节点内存储的值获得节点的方法
        for(Node<E> x = first; x!=head;x = x.next){
            if(x.item.equals(e)){
                return x;
            }
        }
        return null;
    }
    private void nodeToNull(Node<E> x){//废弃节点的方法
        x.prev = null;
        x.next = null;
    }
    public boolean contains(E e){
        for(Node<E> x = first; x!=head;x = x.next){
            if(x.item.equals(e)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(size*2);
        sb.append("[");
        for(Node<E> x=first;x!=head;x=x.next){
           sb.append(x.item);
           sb.append(",");
        }
        sb.replace(sb.length()-1,sb.length(),"]");
        return sb.toString();
    }
}
