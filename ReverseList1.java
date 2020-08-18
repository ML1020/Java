package Demo.ListDemo;

class Node{
    public int val;
    public Node next;
    public Node random;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class ReverseList {
    public static Node reverseList(Node head){               //逆置单链表
        //遍历单链表然后进行头插
        Node newList = null;
        Node cur = head;
        Node next = null;
        while(cur != null){
            next = cur.next;   //先保存下来，防止后面代码使得next变换
            cur.next = newList;    //指针指向的地方进行赋值
            newList = cur;        //newList指向的地方 赋值给 cur指向的地方
            cur = next;
        }
        return newList;
    }

    public static void show(Node head){                      //打印显示链表
        Node cur = head;
        while(cur != null){
            System.out.printf("%d->",cur.val);
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){                  //主函数
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(5);
        Node n5 = new Node(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        n1.random = n2;
        n2.random = n1;
        n3.random = n3;
        n4.random = null;
        n5.random = n3;

        Node n6 = new Node(2);
        Node n7 = new Node(4);
        Node n8 = new Node(6);
        Node n9 = new Node(7);
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = null;


        //Node result = new Practice().reverseList(n1);
        Node result = reverseList(n1);             //逆置单链表
        show(result);
        Node result2 = reverseList(result);        //逆置单链表
        show(result2);

      //  Node result3 = removeAllVal(result2,5);    //删除所有的val
     //   show(result3);

          show(n6);
      //  Node result4 = mergeList(n1,n6);           //合并有序链表
      //  show(result4);

      //  Node result5 = copyRandomList(n1);
       // show(result5);
    }
}
