package presenters;

import models.WordsFunctions;
import views.ConsoleMenu;
import views.PrintFunctions;

import java.util.Scanner;

public class MenuSelection {
    Model model = new WordsFunctions();
    View view = new PrintFunctions();
    Presenter presenter = new Presenter("input.txt", model, view);

    public void start(){
        System.out.println("Вас приветствует виртуальный пикник!");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            ConsoleMenu.menuConsole();
            String userInput = scanner.nextLine();
            if (userInput.equals("1")){
                presenter.wordCounterPresenter();
            }
            else if (userInput.equals("2")){
                presenter.longestWordPresenter();
            }
            else if (userInput.equals("3")){
                presenter.wordsFrequencyPresenter();
            }
            else if (userInput.equals("0")){
                scanner.close();
                flag = false;
            }
            else {
                System.out.println("Такой команды не существует, повторите попытку");
            }
        }
    }
}
