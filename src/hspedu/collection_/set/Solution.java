package hspedu.collection_.set;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] myNums = new int[6];
        myNums[0] = 1;
        myNums[1] = 4;
        myNums[2] = 2;
        myNums[3] = 1;
        myNums[4] = 1;
        myNums[5] = 1;
        Solution s = new Solution();
        System.out.println(s.removeDuplicates(myNums));


    }


    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            if(!myArrayList.contains(nums[i])){
                myArrayList.add(nums[i]);
            }
        }
        return myArrayList.size();
    }
}