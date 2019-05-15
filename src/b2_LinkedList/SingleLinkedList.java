package b2_LinkedList;

/**单向链表
 * Created by liqiang on 2019/5/11.
 */
public class SingleLinkedList{



    //创建一个链表头和尾
    private Node head = null;
    private Node tail = null;


    /**
     * 创建一个链表
     * @param strings 需要放入的字符串
     * @return
     */
    private Node createSingleLinkedList(String  strings){

        if(strings == null || strings.length() == 0)throw new RuntimeException("strings is illegal");
        char [] string = strings.toCharArray();
        for (char chars : string) {
            String charString = String.valueOf(chars);
            if (head == null || tail == null) {
                head = new Node();
                head.mData = charString;
                tail = head;
            }
            //创建新的链表
            Node nextNode = new Node();
            nextNode.mData = charString;
            nextNode.mNext = null;
            //tail 的地址指向下一个
            tail.mNext = nextNode;
            //让 tail 移向下一个
            tail = nextNode;
        }
        return head;
    }


    /**
     * 初始化一个单链表
     * @return 表头
     */
    public Node init(){
        return createSingleLinkedList("1234566");
    }

    /**
     * 初始化一个单链表
     * @param data 数据
     * @return 表头
     */
    public Node init(String data){
        return createSingleLinkedList(data);
    }

    /**
     * 链表尾部插入一个节点
     * @param data
     * @return
     */
    public Node insert(String data){
        if(head == null || tail == null){
            head = new Node();
            head.mData = data;
            tail = head;
        }
        Node newNode = new Node();
        newNode.mData = data;
        tail.mNext = newNode;
        tail = newNode;
        return head;
    }




}
