class MyLinkedList {
    
    int n;
    ListNode head;
    
    class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        n = 0;
    }
    
    public int get(int index) {
        if (index >= n || head == null) {
            return -1;
        }
        ListNode curr = head;
        int i = 0;
        while(i != index) {
            curr = curr.next;
            i++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
        n++;
    }
    
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            ListNode curr = head;
            ListNode temp = new ListNode(val);
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            n++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if (index > n) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == n) {
            addAtTail(val);
        } else {
            ListNode temp = new ListNode(val);
            ListNode curr = head;
            int i = 0;
            while(i != index - 1) {
                i++;
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = temp;
            temp.next = next;
            n++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (head == null || index >= n) {
            return;
        } 
        if (index == 0) {
            head = head.next;
            n--;
            return;
        }
        ListNode curr = head;
        ListNode prev = null;
        int i = 0;
        while(i != index) {
            i++;
            ListNode temp = curr.next;
            prev = curr;
            curr = temp;
        }
        prev.next = curr.next;
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