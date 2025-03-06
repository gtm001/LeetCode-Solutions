// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
        
//     }
// }
import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
            int n = nums.length;
                    if (n < k) return 0;

                            HashSet<Integer> set = new HashSet<>();
                                    long maxSum = 0, sum = 0;
                                            int left = 0;

                                                    for (int right = 0; right < n; right++) {
                                                                // Remove duplicate elements by shrinking the window from the left
                                                                            while (set.contains(nums[right])) {
                                                                                            sum -= nums[left];  // Remove leftmost element from sum
                                                                                                            set.remove(nums[left]);  // Remove from HashSet
                                                                                                                            left++;  // Move left pointer forward
                                                                                                                                        }

                                                                                                                                                    // Add the new element to the window
                                                                                                                                                                sum += nums[right];
                                                                                                                                                                            set.add(nums[right]);

                                                                                                                                                                                        // When the window size reaches exactly k, update maxSum
                                                                                                                                                                                                    if (right - left + 1 == k) {
                                                                                                                                                                                                                    maxSum = Math.max(maxSum, sum);

                                                                                                                                                                                                                                    // Move left pointer forward to check next subarray
                                                                                                                                                                                                                                                    sum -= nums[left];
                                                                                                                                                                                                                                                                    set.remove(nums[left]);
                                                                                                                                                                                                                                                                                    left++;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                return maxSum;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    