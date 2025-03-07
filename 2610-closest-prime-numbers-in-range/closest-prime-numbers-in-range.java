import java.util.Arrays;

class Solution {
    public int[] closestPrimes(int left, int right) {
            // Using the Sieve of Eratosthenes to mark primes in [1, right]
                    boolean[] prime = new boolean[right + 1];
                            Arrays.fill(prime, true);
                                    prime[0] = false;
                                            prime[1] = false;

                                                    // Marking non-primes using the sieve algorithm
                                                            for (int p = 2; p * p <= right; p++) {
                                                                        if (prime[p]) {
                                                                                        for (int i = p * p; i <= right; i += p) {
                                                                                                            prime[i] = false;
                                                                                                                            }
                                                                                                                                        }
                                                                                                                                                }

                                                                                                                                                        // Finding the closest prime pair in range [left, right]
                                                                                                                                                                int[] res = {-1, -1};
                                                                                                                                                                        int minDiff = Integer.MAX_VALUE;
                                                                                                                                                                                int prev = -1; // Store previous prime

                                                                                                                                                                                        for (int i = left; i <= right; i++) {
                                                                                                                                                                                                    if (prime[i]) {
                                                                                                                                                                                                                    if (prev != -1) {
                                                                                                                                                                                                                                        int diff = i - prev;
                                                                                                                                                                                                                                                            if (diff < minDiff) {
                                                                                                                                                                                                                                                                                    res[0] = prev;
                                                                                                                                                                                                                                                                                                            res[1] = i;
                                                                                                                                                                                                                                                                                                                                    minDiff = diff;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                        prev = i; // Update previous prime
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                    return res;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        