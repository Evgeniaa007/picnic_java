package views;

import presenters.View;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PrintFunctions implements View {
    @Override
    public void printWordCounter(int amount) {
        if (amount != 0) {
            System.out.println("Количество фруктов на пикнике: " + amount);
        }
    }
    @Override
    public void printLongestWord(String word){
        if (!word.isEmpty()){
            System.out.println("Самое длинное название фрукта на пикнике - " + word);
        }
    }

    @Override
    public void printWordsFrequency(HashMap<String, Integer> hashFruits) {
        hashFruits.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }


}
