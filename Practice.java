public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2};
        int n = 2;
        System.out.println(countOccurrences(arr, n)); 
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                count++;
            }
        }

        return count;
    }
    
}


