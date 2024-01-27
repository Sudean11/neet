package injava;

public class Que{

    Node headNode;
    Node lastNode;

    public static void main(String[] args) {
        Que q = new Que();
    }


    Que(){}

    void addNode(Node node){

        if(this.headNode == null){
            this.headNode = node;
            this.lastNode = node;
            return;
        }

        lastNode.nextNode = node;
        this.lastNode = node;
    }

    Node popNode(){

        if(headNode == null){
            return null;
        }

        if(headNode.equals(lastNode)){
            Node returnNode = this.headNode;
            headNode = lastNode = null;
            return returnNode;
        }

        Node returnNode = this.headNode;
        this.headNode = headNode.nextNode;
        return returnNode;
    }

    public class Node{
        String value;
        Node nextNode;

        Node(String value){
            this.value = value;
        }
    }

}