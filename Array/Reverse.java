package Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        int[] arr = {32,12,3,1,5,3,65,95};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start,end );
            start++;
            end--;
        }
    }
}
