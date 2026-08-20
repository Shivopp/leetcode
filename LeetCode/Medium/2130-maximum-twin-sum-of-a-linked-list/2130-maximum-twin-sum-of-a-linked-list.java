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
    public int pairSum(ListNode head) {

         int max=-1;
         ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        int n=list.size();

        int[] arr=new int[n/2];
        for(int i=0;i<n/2;i++){
            arr[i]=list.get(i)+list.get(n-1-i);
        }

        for(int i=0;i<n/2;i++){
            max=Math.max(arr[i],max);

        }
        return max;
    }
}