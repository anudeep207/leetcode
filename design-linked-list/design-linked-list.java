class MyLinkedList {
    
    int n;
    ListNode head;
    
    class ListNode {
        int val;
        ListNode next;
        ListNode () {}
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        this.head = null;
        n = 0;
    }
    
    public int get(int index) {
        ListNode curr = head;
        if (index >= n) {
            return -1;
        }
        int i = 0;
        while(i != index) {
            i++;
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val, null);
        temp.next = head;
        head = temp;
        n++;
    }
    
    public void addAtTail(int val) {
        ListNode curr = head;
        ListNode temp = new ListNode(val, null);
        if(curr == null) {
            head = temp;
            n++;
            return;
        }
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        n++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > n) {
            return;
        }
        if(index == n) {
            addAtTail(val);
            return;
        }
        
        ListNode newNode = new ListNode(val, null);
        if(index == 0) {
            addAtHead(val);
            return;
        }
        
        int i = 0;
        ListNode current = head;
        
        while(i != index - 1) {
            current = current.next;
            i++;
        }
        
        ListNode oldNext = current.next;
        
        current.next = newNode;
        newNode.next = oldNext;
        n++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= n) return;
        
        if(index == 0) {
            head = head.next;
            n--;
            return;
        }
        
        int i = 0;
        ListNode current  = head;
        
        while(i != index - 1) {
            current = current.next;     
            i++;
        }
        
        if(current.next.next == null) {
            current.next = null;
            n--;
            return;
        } 
        current.next = current.next.next;
        n--;  
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