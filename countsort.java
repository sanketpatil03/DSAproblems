public class countsort {
    public static void countsorting(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);// calculating max from input array for the length of the count array
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;// storing count of numbers according to index number
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String s[]) {
        int nums[] = { 1, 4, 1, 2, 7, 5, 2 };
        countsorting(nums);

    }
}