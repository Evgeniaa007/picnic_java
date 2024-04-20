package views;

import presenters.View;

public class PrintFunctions implements View {
    @Override
    public void printWordCounter(int amount) {
        if (amount != 0) {
            System.out.println("Количество фруктов на пикнике: " + amount);
        }
    }
    @Override
    public void printLongestWord(String word){
        System.out.println("Самое длинное название фрукта на пикнике - " + word);
    }
}
