PS:
  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of non-zero elements.
  
  For example, given nums = [0, 1, 3, 0, 12], after calling your function, nums should be [1,3,12,0,0]. 

Requirement:
  You must do this in-place without an extra copy of the array.
  Minimize the number of operations.
  
Implementation:
 public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int j = 0;
        for(int num : nums){
            if(num != 0){
                nums[j++] = num;
            }
        }
        
        while(j < nums.length){
            nums[j++] = 0;
        }
        
        return;
        
    }

Following solution "minimize number of operation", but it does not decrease much execution time

public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i > j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        return;
    }
