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
    public ListNode removeNodes(ListNode head) {

        ArrayList<Integer> list=new ArrayList();

        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        Collections.reverse(list);
        int max=list.get(0);

        int n=list.size();
        ArrayList<Integer> ans=new ArrayList();
        ans.add(list.get(0));
        for(int i=1;i<n;i++){
            if(list.get(i)>=max){
                ans.add(list.get(i));
                max=list.get(i);
            }
        }

        Collections.reverse(ans);

        int m=ans.size();
        ListNode root=new ListNode();
        root.val=ans.get(0);

        ListNode prev=root;
        root.next=null;
       for(int i=1;i<m;i++){
        ListNode tempp=new ListNode();

    tempp.val=ans.get(i);
    prev.next=tempp;
    prev=tempp;
        
       }
        


    return root;
        
    }
}