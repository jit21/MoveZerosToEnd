public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZerosToEnd(nums);
        System.out.println("Array after moving zeros to the end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
