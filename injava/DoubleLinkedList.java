package injava;

public class DoubleLinkedList {
    public static void main(String[] args) {
        LinkedListNode node = new LinkedListNode(null, null, "Sudin");
        node.addNodeAfter("Sammy");
        node.addNodeAfter("Bijay");
        node.addNodeAfter("Samish");

        while(node != null){
            System.out.println(node.value);
            node = node.nextNode;
        }
    }
}

class LinkedListNode{
    LinkedListNode prevNode;
    LinkedListNode nextNode;
    String value;

    LinkedListNode(LinkedListNode prevNode, LinkedListNode nextNode, String value){
        this.prevNode = prevNode;
        this.nextNode = nextNode;
        this.value = value;
    }


    void addNodeBefore(String value){
        if(this.prevNode == null){
            this.prevNode = new LinkedListNode(null, this, value);
        }else{
            this.prevNode = new LinkedListNode(this.prevNode, this, value);
        }
    }

    void addNodeAfter(String value){
        if(this.nextNode == null){
            this.nextNode = new LinkedListNode(this, null, value);
        }else{
            LinkedListNode node = new LinkedListNode(this, this.nextNode, value);
            this.nextNode = node;
        }
    }

    LinkedListNode getNextNode(LinkedListNode n){
        return n.nextNode;
    }

    LinkedListNode getPrevNode(LinkedListNode n){
        return n.prevNode;
    }
}
