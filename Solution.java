class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candinate =0;
        for(int num: nums){
            if(count == 0)
                candinate = num;
            if(num == candinate)
                count++ ;
            else
                count --;
                
        }
        return candinate;
    }
}
