package presenters;

import java.util.HashMap;

public interface View {

    void printWordCounter(int amount);

    void printLongestWord(String word);

    void printWordsFrequency(HashMap<String, Integer> hashFruits);

}
