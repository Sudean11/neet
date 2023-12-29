package injava;

class MinStack {

    MinStackNode headNode;


    public MinStack() {

    }

    public void push(int val) {
        if(headNode == null){
            headNode = new MinStackNode(val, val, null );
        }else{
            int minVal = Math.min(val, headNode.minVal);
            this.headNode = new MinStackNode(val, minVal, this.headNode);
        }
    }

    public MinStackNode pop() {
        if(headNode == null){
            System.out.println("No possible");
            return null;
        }else{
            MinStackNode temp = this.headNode;
            this.headNode = this.headNode.nextNode;
            return temp;
        }
    }

    public int top() {
        return  this.headNode.val;
    }

    public int getMin() {
        return this.headNode.minVal;
    }



    class MinStackNode{
        int val;
        int minVal;
        MinStackNode nextNode;

        MinStackNode(int val, int minVal, MinStackNode nextNode){
            this.val = val;
            this.minVal = minVal;
            this.nextNode = nextNode;
        }
    }
}

