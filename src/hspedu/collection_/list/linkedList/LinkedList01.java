package hspedu.collection_.list.linkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node smith = new Node("smith");
        Node hsp = new Node("hsp");

        // 链接三个节点，形成双向链表
//        jack->tom->hsp
        jack.next = tom;
        tom.next = hsp;
//        hsp->tom->jack
        hsp.pre = tom;
        tom.pre = jack;


        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;

        Node first = jack; // 让first引用指向jack,就是双向链表的头节点
        Node last = hsp; // 让last引用指向hsp,就是双向链表的尾节点

        // 从头到尾遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("===");

        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;

        }



    }
}
class Node{
    public Object item; // 真正存放数据
    public Node next; // 指向后一个节点
    public Node pre; // 指向前一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node item=" + item ;

    }
}
