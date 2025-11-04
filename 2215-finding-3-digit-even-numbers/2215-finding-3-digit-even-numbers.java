import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue; // skip leading zero
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int number = nums[i] * 100 + nums[j] * 10 + nums[k];
                    if ( number % 2 == 0 ){
                        set.add(number);
                    }
                }
            }
        }

        int[] result = set.stream().sorted().mapToInt(i -> i).toArray();
        return result;
    }
}