#Leetcode Solution
public ListNode deleteDuplicates(ListNode head) 
    {
            if (head == null) return head;
        
        ListNode list = new ListNode(head.val);
        ListNode node = list;
        ListNode prev = head;
        
        head = head.next;
        
        while (head != null) 
        {
            if (prev.val != head.val) 
            {
                node.next = new ListNode(head.val);
                node = node.next;
            }
            
            prev = head;
            head = head.next;
        }

        return list;
    }
