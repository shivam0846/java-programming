public class ContiguousArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};
        System.out.println("Length of the longest decreasing subarray: "
                + findLongestDecreasingSubarray(arr));
    }
    public static int findLongestDecreasingSubarray(int[] arr) {
        if (arr.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                currentLength++;  
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1; 
            }
        }

        return maxLength;
    }
}