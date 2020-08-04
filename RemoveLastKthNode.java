package Important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//删除倒数第k个节点
public class RemoveLastKthNode {
    public static class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node removeLastKthNode(Node head, int n) {
        //设head为链表的首结点
        Node cur1 = head;
        Node cur2 = head;

        //如果走了n步之后该节点指向空节点，则此链表只有一个节点
        for (int i = 0;i < n;i++){
            head = head.next;
            return head;
        }

        //当第一个指针的下一个节点为空时，则此时第二个指针指向的是被删节点的前一个结点
        while (cur1.next != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        //删除某节点就是将上一节点的指针  指向  这个节点的下一个节点
        cur2.next = cur2.next.next;
        //返回原链表
        return head;
    }

//    public static Node listGenerator(int length, String[] numbers) {
//        Node head = new Node(Integer.parseInt(numbers[0]));
//        Node cur = head;
//        for (int i = 1; i < length; i++) {
//            cur.next = new Node(Integer.parseInt(numbers[i]));
//            cur = cur.next;
//        }
//        cur.next = null;
//        return head;
//    }
//
//    public static void printList(Node head) {
//        while (head != null) {
//            System.out.print(head.value +" ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] parameters = bufferedReader.readLine().split(" ");
//        int n = Integer.parseInt(parameters[0]);
//        int k = Integer.parseInt(parameters[1]);
//        String[] numbers = bufferedReader.readLine().split(" ");
//        Node head = listGenerator(n, numbers);
//        head = removeLastKthNode(head, k);
//        printList(head);
//    }
}


//# include <bits/stdc++.h>
//        using namespace std;
//        struct list_node{
//        int val;
//        struct list_node * next;
//        }; //链表的节点
//        int K;
//        list_node * input_list(void) //读入链表
//        {
//        int n, val;
//        list_node * phead = new list_node();
//        list_node * cur_pnode = phead;
//        scanf("%d %d", &n, &K);
//        for (int i = 1; i <= n; ++i) {
//        scanf("%d", &val);
//        if (i == 1) {
//        cur_pnode->val = val;
//        cur_pnode->next = NULL;
//        }
//        else {
//        list_node * new_pnode = new list_node();
//        new_pnode->val = val;
//        new_pnode->next = NULL;
//        cur_pnode->next = new_pnode;
//        cur_pnode = new_pnode;
//        }
//        }
//        return phead;
//        }
//        list_node * remove_last_kth_node(list_node * head, int K)
//        {
//        //////在下面完成代码
//        if(head==NULL)
//        return NULL;
//        list_node *phead=new list_node;
//        phead->next=head;
//        list_node* p1=head;
//        list_node* p2=head;
//        for(int i=0;i<K-1;i++)
//        p1=p1->next;
//        if(!p1)
//        return NULL;
//        if(!p1->next)
//        return head->next;
//        while(p1->next->next)
//        {
//        p1=p1->next;
//        p2=p2->next;
//        }
//        p2->next=p2->next->next;
//        return phead->next;
//        }
//        void print_list(list_node * head)
//        {
//        while (head != NULL) {
//        printf("%d ", head->val);
//        head = head->next;
//        }
//        }
//        int main ()
//        {
//        list_node * head = input_list(); // 链表的头节点
//        list_node * rhead = remove_last_kth_node(head, K);
//        print_list(rhead);
//        return 0;
//        }