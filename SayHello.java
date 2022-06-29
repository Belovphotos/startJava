import java.util.Arrays;
import java.util.Locale;
public class SayHello {
    public static void main(String[] args) {
            String text = "hello java, hello world, hello people!";

            String word = findMostPopularWordInText(text);
            System.out.println(word);
        }

        private static String findMostPopularWordInText(String text) {
            String[] words = findAllWordsInText(text);
            String[][] uniqueWordsCount = findUniqueWordsCount(words);
            return getWordWithMaxCount(uniqueWordsCount);
        }

        private static String[] findAllWordsInText(String text) {
            return text.split(" ");
        }

        private static String[][] findUniqueWordsCount(String[] words) {
            String[] uniqueWords = new String[words.length];
            String[] counts = new String[words.length];
            int count = 0;
            for (String word:
                    words) {
                var lowerCaseWord = word.toLowerCase();
                if ( !isAlreadyProcessed(uniqueWords, lowerCaseWord, count)){
                    int total = calculateWords(words, lowerCaseWord);
                    uniqueWords[count] = lowerCaseWord;
                    counts[count] = String.valueOf(total);
                    count++;
                }
            }
            return convertResults(uniqueWords, counts, count);
        }

        private static boolean isAlreadyProcessed(String[] uniqueWords, String word, int count) {
            for (int i = 0; i < count; i++) {
                if(uniqueWords[i].equals(word)){
                    return true;
                }
            }
            return false;
        }

        private static int calculateWords(String[] words, String word) {
            int count = 0;
            for (String w:
                    words) {
                if(word.equalsIgnoreCase(w)){
                    count++;
                }
            }
            return 0;
        }
        private static String[][] convertResults(String[] uniqueWords, String[] counts, int count) {
            String[][] result = new String[count][2];
            for (int i = 0; i < count; i++) {
                result[i][0] = uniqueWords[i];
                result[i][1] = counts[i];


            }
            return result;
        }

        private static String getWordWithMaxCount(String[][] uniqueWordsCount) {
            String word = uniqueWordsCount[0][0];
            int maxCount = Integer.parseInt(uniqueWordsCount[0][1]);
            for (int i = 1; i < uniqueWordsCount.length; i++) {
                int currentCount = Integer.parseInt(uniqueWordsCount[i][1]);
                if (currentCount > maxCount){
                    maxCount = currentCount;
                    word = uniqueWordsCount[i][0];

                }
            }
            return word;
        }
}
