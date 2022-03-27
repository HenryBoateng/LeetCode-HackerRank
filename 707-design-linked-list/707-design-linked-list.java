class MyLinkedList {

    
 public class Node{   
    int val;
    Node next;
     public Node(int val){
         this.val = val;
     }
 }
    int size;
    Node head;
    
    public MyLinkedList() {
        head = new Node(-1);
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        
        int count = 0;
        Node curr = head;
        while (count <= index){
            curr = curr.next;
            count ++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size){
            return;
        }
        if(index < 0) index = 0;
        int count = 0;
        Node curr = head;
        while(count < index){
            curr = curr.next;
            count++;
        }
        
        Node toAdd = new Node(val);
        toAdd.next = curr.next;
        curr.next = toAdd;
        
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size){
            return;
        }
        
        //0 1 2 3
        int count = 0;
        Node curr = head;
        while(count < index){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
        size--;
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