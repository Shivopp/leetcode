/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        if(head==null){
            return head;
        }

        ArrayList<Integer> list=new ArrayList();

    ListNode temp=head;
    while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
    }    
    Collections.sort(list);

    int n=list.size();

    ListNode root=new ListNode();
    root.val=list.get(0);
    ListNode prev=root;

    for(int i=1;i<n;i++){
        ListNode neww=new ListNode();
        neww.val=list.get(i);
    prev.next=neww;
    prev=neww;


    }

return root;
        
    }
}