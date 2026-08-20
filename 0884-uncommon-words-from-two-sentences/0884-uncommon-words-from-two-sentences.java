class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        String[] allWords = new String[words1.length + words2.length];
        int index = 0;

        for (String word : words1) {
            allWords[index++] = word;
        }

        for (String word : words2) {
            allWords[index++] = word;
        }
        String[] result = new String[allWords.length];
        int resultIndex = 0;
        for (int i = 0; i < allWords.length; i++) {
            int count = 0;
            for (int j = 0; j < allWords.length; j++) {
                if (allWords[i].equals(allWords[j])) {
                    count++;
                }
            }
            if (count == 1) {
                result[resultIndex++] = allWords[i];
            }
        }
        String[] answer = new String[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}