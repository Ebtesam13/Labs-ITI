import java.util.*;

public class WordDictionary {

    private Map<Character, List<String>> DictionaryMap;

    public WordDictionary() {
        DictionaryMap = new HashMap<>();
    }

    public void addWord(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        if (!DictionaryMap.containsKey(firstChar)) {
            DictionaryMap.put(firstChar, new ArrayList<>());
        }
        DictionaryMap.get(firstChar).add(word);
    }

    public void sortAllWords() {
        DictionaryMap.forEach((key, list) -> Collections.sort(list));
    }

    public void printAllWords() {
        sortAllWords();
        DictionaryMap.forEach((key, words) -> printWords(key, words));
    }

    public void printWordsOfLetter(char letter) {
        char findChar = Character.toLowerCase(letter);
        List<String> words = DictionaryMap.get(findChar);
        if (words != null && !words.isEmpty()) {
            printWords(findChar, words);
        } else {
            System.out.println("No words found for letter " + findChar);
        }
    }

    private void printWords(char key, List<String> words) {
        System.out.print(key + ": [ ");
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
            if (i < words.size() - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();

        dictionary.addWord("cat");
	dictionary.addWord("car");
        dictionary.addWord("ball");
	dictionary.addWord("apple");
	dictionary.addWord("cup");
	dictionary.addWord("banana");
	dictionary.addWord("carrot");
	dictionary.addWord("dog");
	dictionary.addWord("elephant");
	dictionary.addWord("fish");
	dictionary.addWord("grape");	
	dictionary.addWord("honey");
	dictionary.addWord("icecream");
	dictionary.addWord("jacket");
        dictionary.addWord("bat");
        dictionary.addWord("add");
        dictionary.addWord("ant");

        System.out.println("\n--------------------------------------");
        System.out.println("\nAll words:");
        dictionary.printAllWords();
        System.out.println("\n--------------------------------------");

        System.out.println("\nWords starting with 'c':");
        dictionary.printWordsOfLetter('c');
        System.out.println("\n--------------------------------------");
    }
}
