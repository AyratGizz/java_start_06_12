package Seminar_5;

public class Count_Common_Words_With_One_Occuttence_2085 {
    public static void main(String[] args) {

    }

    class Solution {
        public int countWords(String[] words1, String[] words2) {
            Map<String, Integer> count = new HashMap<>();

            for (final String word : words1) {
                count.merge(word, 1, Integer::sum);
            }

            for (final String word : words2) {
                if (count.containsKey(word) && count.get(word) < 2) {
                    count.merge(word, -1, Integer::sum);
                }
            }

            return (int) count.values().stream().filter(v -> v == 0).count();
        }
    }
}
