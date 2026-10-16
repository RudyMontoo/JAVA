class Solution {
    int five = 0, ten = 0;

    public boolean lemonadeChange(int[] bills) {
        for (int bill : bills) {
            if (!check(bill)) return false;
        }
        return true;
    }

    public boolean check(int cm) {
        if (cm == 5) {
            five++;
            return true;
        }
        if (cm == 10) {
            if (five > 0) {
                five--;
                ten++;
                return true;
            }
            return false;
        }
        // cm == 20
        if (ten > 0 && five > 0) {      // greedy: pehle 10+5
            ten--;
            five--;
            return true;
        }
        if (five >= 3) {                // warna 5+5+5
            five -= 3;
            return true;
        }
        return false;
    }
}