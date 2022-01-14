// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] temp = s.split(" ");
        return temp[temp.length - 1].length();
    }
}