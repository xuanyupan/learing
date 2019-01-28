package Exercise.Offer;

/**
 * @Date: 2019/1/16 16:53
 * @Author: xuanyupan
 * @Desc: 复制链表
 */
public class Exercise_Offer_26 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode currentNode = pHead;

        // 复制节点
        while (currentNode != null){
            // 复制出心节点，保存当前的下一个节点
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        currentNode = pHead;
        // 将复制的节点的random 链接起来

        while(currentNode != null){
            if (currentNode.random == null){
                currentNode.next.random = null;
            }else
                currentNode.next.random = currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        // 拆分链表，返回复制的链表
        currentNode = pHead;
        RandomListNode cloneHead = pHead.next;
        while (currentNode != null){
            RandomListNode cloneNode = currentNode.next; // 这里就是找克隆节点和原节点关系。
            currentNode.next = cloneNode.next;

            // 根绝克隆出的节点 找下一个原节点，
            if (cloneNode.next == null){
                cloneNode.next = null;
            }else
                cloneNode.next = cloneNode.next.next;
            currentNode = currentNode.next;
        }

        return cloneHead;
    }


}


