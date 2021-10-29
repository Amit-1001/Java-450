package Array;

public class kthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {10,4,5,8,11,6,26};

        int start =0;
        int end = arr.length-1;
        int k =5;
            int ele = arr[findKthNumber(arr,start,end,k)];
        System.out.println(k+"th smallest number in array is :"+ele);
    }

    private static int findKthNumber(int[] arr, int start, int end, int k) {

        while (start<=end){
             // we used lomuto partition cause as it sort element each element is placed at its right place
            // pivot placed at its right place
            int pivot = LomutoPartion(arr,start,end);

            if(pivot == k-1){
                return  pivot; // if element is found at position k-1  return pivot which is kth small element
            }
            else if(pivot > k-1){ // if pivot which is index of sorted element is greater than k-1 then we have to search in left
                end = pivot - 1;
            }
            else {
                start = pivot + 1;
            }
        }


        return -1;
    }

    private static int LomutoPartion(int[] arr, int start, int end) {
            int pivot = arr[end];
            int j = start-1;
            for(int i =start; i<=end; i++){
                if(pivot > arr[i]){
                    j++;
                    swap(arr,j,i);
                }
            }
            swap(arr,j+1,end);

            return j+1; // index of pivot ( sored  element )
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
