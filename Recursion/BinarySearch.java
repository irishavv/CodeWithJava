package Recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,5,7,8,9,10,13,15,16,19,23,27};
        int target = 19;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr,target,start,mid);
        }
        else{
            return search(arr,target,mid+1,end);
        }
    }
}
