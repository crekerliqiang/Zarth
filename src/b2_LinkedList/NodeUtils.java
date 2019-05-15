package b2_LinkedList;

/**
 * 链表操作的基本方法
 * Created by liqiang on 2019/5/10.
 */
public class NodeUtils {


    public static void printLinkList(Node head){
        if(head == null)throw new RuntimeException("head is null");
        Node current = head;
        while(current != null){
            System.out.print(current.mData);
            current = current.mNext;
            if(current != null)System.out.print(",");
        }


    }
}
