package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int nums[] = { 6, 5, 2, 8, 9, 4 };

        for (int i : nums) {
            System.out.print(i + " ");
        }

        quickSort(nums, 0, nums.length - 1);

        System.out.println();
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);

            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
    }

    // Função que encontra o pivô, esse é o nome padrão
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        int swapTemp;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                swapTemp = nums[i];
                nums[i] = nums[j];
                nums[j] = swapTemp;
            }
        }

        swapTemp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = swapTemp;

        return i + 1;
    }
}
