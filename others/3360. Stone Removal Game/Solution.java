class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) {
            return false;
        }

        boolean isAliceChance = true;
        int toRemove = 10;

        while (true) {
            int removal = toRemove--;

            if (removal > n) {
                return !isAliceChance;
            }

            n -= removal;

            isAliceChance = !isAliceChance;
        }
    }
}
