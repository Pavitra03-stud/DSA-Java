class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int i=0;
        for(int num : nums){
            if(count==0){
                i=num;
            }
            if(num==i){
                count++;
            }else{
                count--;
            }
        }
        return i;
    }
}