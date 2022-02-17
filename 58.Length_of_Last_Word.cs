public class Solution {
    public int LengthOfLastWord(string s) {
        string[] sub = s.Trim().Split(" ");
        int length = sub[sub.Length - 1].Length;
        return length;
    }
}
