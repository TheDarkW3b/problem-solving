class Solution {
    public boolean hasMatch(String s, String p) {
        String pattern = p.replace("*", ".*");
        return s.matches(".*" + pattern + ".*");
    }
}
