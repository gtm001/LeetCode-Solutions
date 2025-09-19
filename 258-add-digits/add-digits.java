// class Solution {
//     public int addDigits(int num) {
//         if (num == 0) return 0;
//         return 1 + (num - 1) % 9;
//     }
// }


class Solution {
    public int addDigits(int num) {
        while (num >= 10) { // keep going until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num; // final single-digit result
    }
}
