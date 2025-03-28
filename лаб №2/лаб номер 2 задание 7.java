
public class Main {
    public static void main(String[] args) {
        
        String input = "abc abc ab abc ab acs acs";
        String result = removeDuplicateWords(input);
        System.out.println(result); 
    }

    public static String removeDuplicateWords(String input) {
        HashSet<String> seenWords = new HashSet<>(); 
        StringBuilder result = new StringBuilder(); 

        // Разделяем строку на слова
        String[] words = input.split(" ");

        for (String word : words) {
           
            if (!seenWords.contains(word)) {
                seenWords.add(word);
                result.append(word).append(" "); 
            }
        }

        
        return result.toString().trim();
    }
}

