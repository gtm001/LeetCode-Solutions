import java.util.*;

class Solution {
    public int minCapability(int[] nums, int k) {
            int start = Integer.MAX_VALUE;
                    int end = Integer.MIN_VALUE;

                            for (int num : nums) {
                                        start = Math.min(start, num);
                                                    end = Math.max(end, num);
                                                            }

                                                                    int ans = 0;
                                                                            while (start <= end) {
                                                                                        int mid = start + (end - start) / 2;

                                                                                                    if (isValidToRob(mid, nums, k)) {
                                                                                                                    ans = mid;
                                                                                                                                    end = mid - 1;
                                                                                                                                                } else {
                                                                                                                                                                start = mid + 1;
                                                                                                                                                                            }
                                                                                                                                                                                    }
                                                                                                                                                                                            return ans;
                                                                                                                                                                                                }

                                                                                                                                                                                                    private boolean isValidToRob(int mid, int[] nums, int k) {
                                                                                                                                                                                                            int cnt = 0;
                                                                                                                                                                                                                    for (int i = 0; i < nums.length; i++) {
                                                                                                                                                                                                                                if (nums[i] <= mid) {
                                                                                                                                                                                                                                                cnt++;
                                                                                                                                                                                                                                                                i++;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        if (cnt >= k)
                                                                                                                                                                                                                                                                                                        return true;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            }