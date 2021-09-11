public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void remove(){
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }


    public void printValues(){
        if (this.head == null){
            System.out.println("Empty");
        }
        Node runner = this.head;
        int counter = 0;
        while (runner != null){
            if (counter < 1){
                System.out.println("Head: " + runner.value);
                counter++;
                runner = runner.next;
            } else {
                System.out.println("Node:" + counter + " " + runner.value);
                runner = runner.next;
                counter++;
            }
        }
    }
}

