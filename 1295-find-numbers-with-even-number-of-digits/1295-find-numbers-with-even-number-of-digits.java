class Solution {
    public int findNumbers(int[] nums) {
        int observations = 0;
        for(int num : nums){
           int  digits = 0;
           int temp = num;
           while(temp>0){
            digits ++;
            temp /= 10;
           }
            if(digits % 2 == 0){
            observations ++ ;
        }
        }
        return observations;
    }
}