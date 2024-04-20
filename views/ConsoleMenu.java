package views;


public class ConsoleMenu {

    public static void menuConsole() {
        String text = " Меню \n " +
                "1. Подсчитать количество фруктов и овощей \n " +
                "2. Найти самое длинное название фрукта \n " +
                "3. Показать самые популярные фрукты (частоту повторений) \n " +
                "0. Выход \n" +
                "Введите цифру, соответствующую необходимому критерию: ";
        System.out.println(text);
    }
}
