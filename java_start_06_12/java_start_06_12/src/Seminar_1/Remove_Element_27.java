package Seminar_1;

public class Remove_Element_27 {
    public static void main(String[] args) {
    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;

            for (final int num : nums)
                if (num != val)
                    nums[i++] = num;

            return i;
        }
    }
}
