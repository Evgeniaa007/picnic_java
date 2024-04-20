package presenters;

import models.WordsFunctions;
import views.PrintFunctions;

public class Presenter {
    String fileName;
    private Model model;
    private View view;

    public Presenter(String fileName, Model model, View view) {
        this.fileName = fileName;
        this.model = model;
        this.view = view;
    }

    public void wordCounterPresenter(){
        view.printWordCounter(model.wordCounter(fileName));
    }

    public void longestWordPresenter(){
        view.printLongestWord(model.longestWord(fileName));
    }

    public void wordsFrequencyPresenter(){
        view.printWordsFrequency(model.wordsFrequency(fileName));
    }
}
