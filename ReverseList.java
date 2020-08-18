package LinkedListS;

class Node{
    public Node next;
    public int value;
    public Node(Node next,int value){
        this.next = next;
        this.value = value;
    }

}
public class ReverseList {
    public void reverseList(Node head){
        Node cur = head;
        Node next = null;
        Node newlist = null;
        while (cur != null){
//            next = cur.next;   //先保存下来，防止后面代码使得next变换
//            cur.next = newList;    //指针指向的地方进行赋值
//            newList = cur;        //newList指向的地方 赋值给 cur指向的地方
//            cur = next;
            next = cur.next;
            cur.next = newlist;    //这个结点指向新链表所指向的东西，也就是指向上一个节点
            newlist = cur;     //新的链表指向这个节点
            cur = next;
        }
    }
}
