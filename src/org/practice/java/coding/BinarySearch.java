package org.practice.java.coding;

public class BinarySearch {
    public static int[] arr = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        System.out.println(BinarySearch.findElementBinary(9,0,arr.length));
    }

    public static String findElementBinary(int target,int start , int end){

        if(start > end){
            return "Not found";
        }

        int mid = (int) Math.floor((start+end)/2);

        if(target == arr[mid])
            return "Found Element "+arr[mid-1];

        if(arr[mid] > target){
            return findElementBinary(target,start,mid-1);
        }

        if(arr[mid] < target){
            return findElementBinary(target,mid+1,end);
        }

    return null;
    }
}
