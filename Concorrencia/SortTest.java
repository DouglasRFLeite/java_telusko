import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10009);
        nums.add(90002);
        nums.add(30003);

        System.out.println(nums); // [10009, 90002, 30003]

        Collections.sort(nums);
        System.out.println(nums); // [10009, 30003, 90002]

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1) {
                if (arg0 % 10 > arg1 % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };

        Collections.sort(nums, comparator);
        System.out.println(nums); // [90002, 30003, 10009]
    }
}
