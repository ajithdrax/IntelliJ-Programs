package org.example;

public class BinarySearch {

    public static void main(String[] args) {

        int nums[] = {3, 5, 7, 9, 11, 13};
        int target = 3;
        int result = binarySearch(nums, target);

        if (result != -1)
            System.out.println("element found at Index : " + result);

        else
            System.out.println("element not found");

    }

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left+right)/2;

            if (nums[mid]==target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}
