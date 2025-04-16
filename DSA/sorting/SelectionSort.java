package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };

        for (int i : nums) {
            System.out.print(i + " ");
        }

        // Usando o valor máximo
        for (int i = nums.length - 1; i > 0 - 1; i--) {
            int maxIndex = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;

        }

        System.out.println();
        for (int i : nums) {
            System.out.print(i + " ");

        }
    }
}
