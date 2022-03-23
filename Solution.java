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
___________________OR________________

class Solution {
     public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        for (int num : nums) {
            if (map.containsKey(num)) {
                count = map.get(num);
                map.put(num, ++count);
            } else {
                map.put(num, 1);
            }
        }

        int max = 0;
        int output = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                output = entry.getKey();
            }
        }

        return output;
    }
}
