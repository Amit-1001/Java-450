package Array;

public class kthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,4,5,8,11,6,26};
        int start =0;
        int end = arr.length -1;
        int k =5;

        int ele = findKthLargest(arr,start,end,k);

        System.out.println("Kth largest element in array is:"+arr[ele]);
    }

    private static int findKthLargest(int[] arr, int start, int end, int k) {

        while (start<=end){
            int pivot = partion(arr,start,end);

            if(pivot == k-1){
                return  pivot;
            }
            else if(pivot > k-1) {
                end = pivot-1;
            }
            else {
                start = pivot +1;
            }
        }

        return  -1;
    }

    private static int partion(int[] arr, int start, int end) {
        int j  = start -1;
        int pivot = arr[end];
        for(int i=start ; i<= end ; i++){
            if(pivot<arr[i]){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,j+1,end);

        return  j+1;

    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
