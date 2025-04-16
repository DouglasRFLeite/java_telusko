package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };

        for (int i : nums) {
            System.out.print(i + " ");
        }

        mergeSort(nums, 0, nums.length - 1);

        System.out.println();
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int leftNums[] = new int[mid - left + 1];
        int rightNums[] = new int[right - mid];

        for (int i = 0; i < leftNums.length; i++) {
            leftNums[i] = nums[left + i];
        }

        for (int i = 0; i < rightNums.length; i++) {
            rightNums[i] = nums[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftNums.length && j < rightNums.length) {
            if (leftNums[i] <= rightNums[j]) {
                nums[k] = leftNums[i];
                i++;
            } else {
                nums[k] = rightNums[j];
                j++;
            }
            k++;
        }

        while (i < leftNums.length) {
            nums[k] = leftNums[i];
            i++;
            k++;
        }

        while (j < rightNums.length) {
            nums[k] = rightNums[j];
            j++;
            k++;
        }

    }
}
