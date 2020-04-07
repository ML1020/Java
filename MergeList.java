package Demo.ListDemo;

public class MergeList {
    public static Node mergeList1(Node head1,Node head2){     //合并有序链表
        Node cur1 = head1;
        Node cur2 = head2;
        Node newList = null;
        Node last = null;
        Node next1 = null;
        Node next2 = null;
        if (cur1 == null){return head2;}
        if(cur2 == null){return head1;}

        while (cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                next1 = cur1.next;
                if(newList == null){
                    next1 = cur1.next;
                    cur1.next = newList;
                    newList = cur1;
                }else{
                    last.next = cur1;
                }
                last = cur1;
                cur1 = next1;
            }else{
                next2 = cur2.next;
                if(newList == null){
                    next2 = cur2.next;
                    cur2.next = newList;
                    newList = cur2;
                }else{
                    last.next = cur2;
                }
                last = cur2;
                cur2 = next2;
            }
        }
        if(cur1 != null){
            last.next = cur1;
        }else{
            last.next = cur2;
        }
        return newList;
    }


    
    public Node mergeTwoLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        Node head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
