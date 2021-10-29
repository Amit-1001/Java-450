package Array;

public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3,3};

        int res = findNumber(arr);

        System.out.println("Duplicate number in array is:"+res);
    }

    private static int findNumber(int[] arr) {
        // using cycle sort
        int duplicate = -1;
        int correct_index = 0;
        int i=0;
        while (i<arr.length){
            correct_index = arr[i]-1; // checking if current element is at its right position
            // 1 should be at 0 position 2 should be at 1 position ... etc

            if(arr[i]<arr.length && arr[correct_index] != arr[i]){ // if element is not at its right position then swap it with right position
                swap(arr,correct_index,i);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){ // checking if element is at right position if element is not at its right position that element is repeating in array
                duplicate = j;
            }
        }
        if(duplicate == -1){
            return -1;
        }

        return arr[duplicate];
    }

    private static void swap(int[] arr, int correct_index, int i) {
        int temp =  arr[correct_index];
        arr[correct_index]  = arr[i];
        arr[i] = temp;
    }
}
