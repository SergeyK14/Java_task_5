package Homework_5;

//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map <String, String> collection = new HashMap<>();
        collection.put("Иванов", "Иван");
        collection.put("Петрова", "Светлана");
        collection.put("Белова", "Кристина");
        collection.put("Мусина", "Анна");
        collection.put("Крутова", "Анна");
        collection.put("Юрин", "Иван");
        collection.put("Светлова", "Мария");
        int m = 0;
        for (int i = 0; i < collection.size(); i++) {
            for (var element: collection.values()){
                System.out.printf("фамилия: %s встречается %s раз\n", element.getKey(), Collections.frequency(collection, element));
            }
        } 
    }   
}
  