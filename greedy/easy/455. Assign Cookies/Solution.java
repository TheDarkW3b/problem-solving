class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int children = 0;
        int l = 0, r = 0;
        while (l < g.length && r < s.length) {
            if (g[l] <= s[r]) {
                children++;
                l++;
            }
            r++;
        }

        return children;
    }
}
