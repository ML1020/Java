package Important;

//查找单链表中倒数第N个节点
class LinkedNode{
    public int val;
    public LinkedNode next;
    public LinkedNode(int val){
        this.val = val;
    }
}

public class LinkedListNth {
    //方法一：单指针
    //先遍历一遍链表，确定链表中节点的个数length。
    // 然后再遍历一遍链表，从前往后第（length-n+1）个节点就是倒数第n个节点。
    //first为n1为head
    public static LinkedNode linkedList(LinkedNode head,int n){
        LinkedNode first = head;
        int length = 0;
        while (first != null){
            first = first.next;
            length++;
        }
        System.out.println(length);
        first = head;
        for (int i = 0;i < length-n;i++){
            first = first.next;
        }
        return first;
//        ListNode first = head;
//        int length = 0;
//        while(first != null){
//            length++;
//            first = first.next;
//        }
//        first = head;
//        for(int i = 0; i < length-n+1; i++){
//            first = first.next;
//        }
//        return first;
    }

    //方法二：双指针
    public static LinkedNode linkedList1(LinkedNode head,int n){
        LinkedNode first = head;
        LinkedNode second = head;
        for (int i =0;i < n;i++){
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    //方法二：双指针
    //设置两个指针，第一个指针从头结点向前走到第n-1个节点时，第二个指针开始从头结点出发。
    // 当第一个指针走到尾结点时，第二个指针的位置即为倒数第n个节点。
    public static LinkedNode nthToLast(LinkedNode head,int n){
        LinkedNode first = head;
        LinkedNode second = head;
        for(int i = 0; i <= n-1; i++){
            //第一个指针开始遍历，保证输入的n值小于链表的长度
            first = first.next;
        }
        //第二个指针开始遍历
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }

    public static void main(String[] args) {
        LinkedNode n1 = new LinkedNode(1);
        LinkedNode n2 = new LinkedNode(2);
        LinkedNode n3 = new LinkedNode(3);
        LinkedNode n4 = new LinkedNode(4);
        LinkedNode n5 = new LinkedNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
//        LinkedNode node1 = linkedList(n1,3);
//        System.out.println(node1.val);
        System.out.println(linkedList(n1,3).val);
        System.out.println(linkedList1(n1,3).val);
    }
}
