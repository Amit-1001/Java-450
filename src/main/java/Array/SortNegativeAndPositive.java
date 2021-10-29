package Array;

import java.util.Arrays;

public class SortNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr ={-1,2,-3,5,-6,4};

        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int start =-1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<0){
                start++;
                swap(arr,i,start);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
