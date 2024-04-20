package views;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperations {
    
    public static List<String> readFile (String filename){
        List<String> fruits = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                fruits.addAll(Arrays.asList(line.split("\\s+")));
            }
            System.out.println(fruits);
            if(fruits.isEmpty()){
                System.out.println("Файл пустой, никакого пикника не будет :(");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не сущесвует");
            e.printStackTrace();
        }
        catch (IOException e) { 
            System.out.println("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
        return fruits;
    }

}
