import models.WordsFunctions;
import presenters.Model;
import presenters.Presenter;
import presenters.View;
import views.FileOperations;
import views.PrintFunctions;

public class Program {
    public static void main(String[] args) {
        Model model = new WordsFunctions();
        View view = new PrintFunctions();
        Presenter presenter = new Presenter("input.txt", model, view);
        presenter.longestWordPresenter();
    }
}