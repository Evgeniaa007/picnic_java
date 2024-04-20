package presenters;
import java.util.HashMap;
import java.util.List;

public interface Model {

    int wordCounter(String fileName);

    String longestWord(String fileName);

    HashMap<String, Integer> wordsFrequency(String fileName);

}
