package b2_LinkedList;

/**
 * 调用方法
 * Created by liqiang on 2019/5/11.
 */
public class Main {
    /**
     * 单链表测试
     */
    private static void singleLinkedListTest(){

        SingleLinkedList linkedList = new SingleLinkedList();
        Node head = linkedList.init();
        linkedList.insert("3");
        linkedList.insert("aiyaya");
        NodeUtils.printLinkList(head);



    }
    public static void main(String[] args){
        singleLinkedListTest();

    }

}
