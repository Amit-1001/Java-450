package Array;

import java.util.Arrays;

public class sort0_1_2 {
    public static void main(String[] args) {
        int[] arr ={0,1,0,1,2,2};

         sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
    int start =0;
    int mid = 0;
    // we are using to pointer which will start from 0;
        // as we have to sort three element
    int end = arr.length -1;

    while (mid<=end){
        if(arr[mid] == 0){ // if we get zero will increment start and mid
            //start pointer is used to place 0 in starting of array
            swap(arr,mid,start);
            start++;
            mid++;

        }
        else if(arr[mid] == 1){
            mid++; // mid pointer is used to place 1 in middle of array
        }
        else {
            swap(arr,mid,end); // end pointer is used to place 2 at end of array
            end--;
        }
    }


    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
