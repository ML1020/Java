class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}
//一、采用链表遍历，结点元素求和加进位运算
//二、将链表转换为整数，进行求和计算，然后整数有转换为链表即可√
public class LinkedAB {
    public ListNode plusAB(ListNode a,ListNode b){
        //将链表转换为整数
        int aValue = listNodeConverIntValue(a);
        int bValue = listNodeConverIntValue(b);
        //计算求和
        int sumValue = aValue + bValue;
        //将整数转换为链表
        return intValueConverListNode(sumValue);
    }

    private int listNodeConverIntValue(ListNode node) {
        StringBuilder sb = new StringBuilder();
        ListNode cur = node;
        while (cur != null){
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }


    private ListNode intValueConverListNode(int value) {
        char[] charArray = String.valueOf(value).toCharArray();
        ListNode node = new
                ListNode(Integer.parseInt(String.valueOf(charArray[charArray.length-1])));
        ListNode cur = node;
        //整数反转存储在链表中
        for (int i = charArray.length - 2;i >= 0;i--){
            ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(charArray[i])));
            cur.next = newNode;
            cur = newNode;
        }
        return node;
    }
}
