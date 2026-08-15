class Solution {
    public int elevatorRequests(int n, int[] requests) {

    int sum=requests[0];
    int m=requests.length;
    for(int i=1;i<m;i++){
        sum+=Math.abs(requests[i]-requests[i-1]);
    }
        return sum;
    }
}