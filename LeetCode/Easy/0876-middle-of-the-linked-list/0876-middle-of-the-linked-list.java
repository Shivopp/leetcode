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
    public ListNode middleNode(ListNode head) {
        int size=0;

        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
    ListNode ans=head;
        if(size%2==0){
            int index=(size+1)/2;
            
            for(int i=0;i<index;i++){
                ans=ans.next;
            }
            
        }
        else if(size%2!=0){
            int index=(size-1)/2;
            
            for(int i=0;i<index;i++){
                ans=ans.next;
            }
            
        }
        return ans;
    }
}