package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };

        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}