package Array;

public class TrappingWater {
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};

        int res = findTrappedWater(arr);
        System.out.println("Trapped water is:"+res);
    }

    private static int findTrappedWater(int[] arr) {
        int[] left_max =new int[arr.length];
        int[] right_max =new int[arr.length];

        left_max[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            left_max[i] = Math.max(arr[i],left_max[i-1]); // finding all max capacity in left side
        }

        right_max[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length-2;i>=0; i--){
            right_max[i] = Math.max(arr[i],right_max[i+1]); // finding all max capacity in right side
        }

        // finding the max trapped water
        int res = 0;

        for(int i=1; i<arr.length-1;i++){
            res = res+ Math.min(left_max[i],right_max[i])-arr[i];
        }
        return  res;
    }
}
