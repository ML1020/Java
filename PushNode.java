package Demo.ListDemo;

class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
    }
}

//public class PushNode {
//    //头插
//    public static Node pushFront(Node head,int value){
//        Node node = new Node(value);
//        //直接将节点插入头结点之前
//        node.next = head;
//        return node;
//    }
//
//    //尾插
//    public static Node pushBack(Node head,int value){
//        Node node = new Node(value);
//        //如果头结点为空，即为空链表，直接头插即可
//        if (head == null){
//            node.next = head;
//            return node;
//        }else {
//            //否则调用getLast方法找到为节点，将节点尾插在最后一个节点之后
//            Node last = getLast(head);
//            last.next = node;
//            return head;
//        }
//    }
//
//    //打印链表
//    public static void display(Node head){
//        for(Node cur=head;cur!=null;cur=cur.next){
//            System.out.printf("%d ->",cur.value);
//        }
//        System.out.println("null");
//    }
//
//    //找最后一个节点
//    private static Node getLast(Node head){
//        Node last=head;
//        while(last.next!=null){
//            last=last.next;
//        }
//        return last;
//    }
//
//    public static void main(String[] args) {
//        Node head=null;
//        head = pushBack(head,1);
//        head = pushBack(head,2);
//        head = pushBack(head,3);
//        display(head);
//        head = pushFront(head,10);
//        head = pushFront(head,20);
//        head = pushFront(head,30);
//        display(head);
//    }
//}


public class PushNode {
    //头插
    public static Node pushFront(Node head, int value) {
        Node node = new Node(value);
        //直接将节点头插至第一个节点
        node.next = head;
        return node;
    }

    //尾插
    public static Node pushBack(Node head, int value) {
        Node node = new Node(value);
        //如果头结点为空，即为空链表，直接头插即可
        if (head == null){
            node.next = head;
            return node;
        }
        else {//否则调用getLast方法找到为节点，将节点尾插在最后一个节点之后
            Node last = getLast(head);
            last.next = node;
            return head;
        }
    }

    //打印链表
    public static void display(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.printf("%d ->", cur.value);
        }
        System.out.println("null");
    }

    //找最后一个节点
    private static Node getLast(Node head) {
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        Node head = null;
        head = pushBack(head, 1);
        head = pushBack(head, 2);
        head = pushBack(head, 3);
        display(head);
        head = pushFront(head, 10);
        head = pushFront(head, 20);
        head = pushFront(head, 30);
        display(head);
    }
}