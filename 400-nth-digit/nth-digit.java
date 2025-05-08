class Solution {
    //megha0
    public int findNthDigit(int n) {
        n -= 1;
    int d = 1, f = 1;
    while (n / 9 / f / d >= 1) {
        n -= 9 * f * d;
        d++;
        f *= 10;
    }
    return (f + n/d + "").charAt(n%d) - '0';
    }
}