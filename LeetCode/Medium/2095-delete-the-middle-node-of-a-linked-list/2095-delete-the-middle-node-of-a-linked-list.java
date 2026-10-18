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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }

        ListNode temp=head;

        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int goal=(n/2)-1;

        temp=head;


     while(goal-->0){

        temp=temp.next;

     }
     if(temp.next.next!=null){
        temp.next=temp.next.next;
     }
     else{
        temp.next=null;
     }
     


     return head;
        
    }
}