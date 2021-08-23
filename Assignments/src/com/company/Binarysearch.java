package com.company;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,12,23,44,65,76,97,108,119};
        int target = 119;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
