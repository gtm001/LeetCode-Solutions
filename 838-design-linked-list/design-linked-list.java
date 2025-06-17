class MyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        Node curr = head;
        int count = 0;
        while(count<index && curr!=null ){
            curr = curr.next;
            count++;
        }
        if(curr==null){
            return -1;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        int count = 0;

        if(index==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        while(count<index-1 && curr!=null){
            curr = curr.next;
            count++;
        }
        if(curr==null){
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || head==null){
            return;
        }
        int count = 0;
        Node curr = head;

        if(index==0){
            head = head.next;
            return;
        }
        while(count<index-1 && curr!=null){
            curr = curr.next;
            count++;
        }
        if(curr==null || curr.next==null){  //imp
            return;
        }
        curr.next = curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */