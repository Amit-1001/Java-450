package Array;

public class largestSumInSubArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,-2,5};

        int res = findMaxSum(arr);
        System.out.println("Maximum sum of sub array is :"+res);
    }

    private static int findMaxSum(int[] arr) {
        int sum = arr[0];
        int max = arr[0];

        for(int i=1; i< arr.length; i++){
            sum = Math.max(sum+arr[i],arr[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}
