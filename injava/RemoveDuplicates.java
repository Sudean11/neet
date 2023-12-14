package java;
public class RemoveDuplicates {
    
    public static void main(String[] args) {
        new RemoveDuplicates().removeDuplicates(new int[]{1,1,2});
    }

    public int removeDuplicates(int[] nums) {
        int newNumber = 0;
        int previousNum = -198979;
        int[] newArr = new int[nums.length];
        for(int i: nums){
            if(previousNum != nums[i]){
                newArr[newNumber] = nums[i];
                newNumber++;
                previousNum = nums[i];
            }else{
                
            }
        }
        nums = newArr;

        System.out.println(nums[2]);
        System.out.println(newNumber);
        return newNumber;
    }
}


enum hello {
    RemoveDuplicates, 
}