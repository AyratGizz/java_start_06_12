package Seminar_1;

public class Merge_SA_1768 {
    public static void main(String[] args) {
        System.out.println(Solution.mergeAlternately("abc", "pqr"));
        System.out.println(Solution.mergeAlternately("ab", "pqrs"));
        System.out.println(Solution.mergeAlternately("abcd", "pq"));

    }

    static class Solution {
        static String mergeAlternately(String word1, String word2) {
            int n = Math.min(word1.length(), word2.length());
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; ++i) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
        }
    }
}
