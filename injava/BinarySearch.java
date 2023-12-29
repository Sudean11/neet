package injava;

public class BinarySearch {

    public static void main(String[] args) {
        BinaryNode head = new BinaryNode(20, null);
        head.createHeadNode();
        head.addNode(15, null);
        head.addNode(6, null);
        head.addNode(10, null);
        head.addNode(5, null);
        head.addNode(34, null);
        head.addNode(54, null);
        head.addNode(344, null);
        head.addNode(544, null);
        head.addNode(23, null);

        System.out.println(head.searchValue(23, head.headNode));
        head.binarySort();

    }

}

class BinaryNode{
    BinaryNode headNode;
    BinaryNode leftNode;
    BinaryNode rightNode;
    BinaryNode parentNode;
    int value;
    boolean traversed = false;

    boolean searchValue(int value, BinaryNode node){
        if(node == null){
            return false;
        }
        if(node.value == value){
            return true;
        }
        if(node.value > value){
            System.out.println(node.value+"--> Left");
            return searchValue(value, node.leftNode);
        }else{
            System.out.println(node.value+"--> Right");
            return searchValue(value, node.rightNode);
        }
    }
    BinaryNode(int value, BinaryNode parentNode){
        this.value = value;
        this.parentNode = parentNode;
    }

    void binarySort(){
        BinaryNode smallestNode = getSmallestNumber(this.headNode);
        System.out.println("******************************");
        printNodes(smallestNode);
    }

    void printNodes(BinaryNode node){
        if(!node.traversed){
            System.out.print(node.value+"*");
        }

        node.traversed = true;


        if(node.leftNode != null && !node.leftNode.traversed){
            printNodes(node.leftNode);
            return;
        }

        if(node.rightNode != null && !node.rightNode.traversed){
            printNodes(node.rightNode);
            return;
        }

        if(node.rightNode == null){
            printNodes(node.parentNode);
            return;
        }
    }
    BinaryNode getSmallestNumber(BinaryNode node){
        if(node.leftNode == null){
            return node;
        }else{
            return getSmallestNumber(node.leftNode);
        }
    }

    void createHeadNode(){
        this.headNode = this;
    }
    void addNode(int value, BinaryNode node){
        if(node == null){
            node = headNode;
        }

        if(node.value > value){
            if(node.leftNode == null){
                node.leftNode = new BinaryNode(value, node);
                return;
            }
            addNode(value, node.leftNode);
        }else{
            if(node.rightNode == null){
                node.rightNode = new BinaryNode(value, node);
                return;
            }
            addNode(value, node.rightNode);
        }
    }
}