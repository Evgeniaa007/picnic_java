package views;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FileOperations {
    
    public static List<String> readFile (String filename){
        List<String> fruits = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                fruits.addAll(Arrays.asList(line.split("\\s+")));
            }
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

    public static HashMap<String, Integer> hashFruits(List<String> fruits){
        HashMap<String, Integer> hashFruits = new HashMap<>();
        for(String fruit : fruits){
            if (hashFruits.containsKey(fruit)){
                hashFruits.put(fruit, hashFruits.get(fruit) + 1);
            }
            else{
                hashFruits.put(fruit, 1);
            }
        }
        System.out.println(hashFruits);
        return hashFruits;
    }
}
