package models;

import presenters.Model;
import views.FileOperations;

import java.util.HashMap;
import java.util.List;

public class WordsFunctions implements Model {

    @Override
    public int wordCounter(String fileName){
        List<String> fruits = FileOperations.readFile(fileName);
        return fruits.size();
    }

    @Override
    public String longestWord(String fileName) {
        List<String> fruits = FileOperations.readFile(fileName);
        String longestWord = "";
        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).length() > longestWord.length()){
                longestWord = fruits.get(i);
            }
        }
        return longestWord;
    }

    @Override
    public HashMap<String, Integer> wordsFrequency(String fileName) {
        return null;
    }
}
