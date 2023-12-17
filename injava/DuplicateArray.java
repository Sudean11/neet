package injava;
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            
            if(a.containsKey(nums[i])){
                return true;
            }
            a.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println( new Solution().containsDuplicate(new int[]{3,3}));

        
    }
}