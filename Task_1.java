package Homework_5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//что 1 человек может иметь несколько телефонов. Добавить функции 1) Добавление номера
//2) Вывод всего
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию: ");
        String surname = scn.nextLine();
        System.out.print("Введите телефон: ");
        Integer telephone = scn.nextInt();

        Map <Integer, String> data = new HashMap<>();
        data.put(telephone, surname);
        System.out.println("Выберите функцию: 1 - добавление номера; 2 - вывод ");
        Character number = scn.next().charAt(0);
        
        switch (number){
            case '1':
                Scanner scn_1 = new Scanner(System.in, "Cp866");
                System.out.println("Введите фамилию: ");
                surname = scn_1.nextLine();
                System.out.print("Введите телефон: ");
                telephone = scn_1.nextInt();
                data.put(telephone, surname);
                scn_1.close(); 
                System.out.println("Выберите функцию: 1 - добавление номера; 2 - вывод "); 
                return;
            case '2':
                for (var element: data.entrySet()){
                    System.out.printf("телефон: %s, фамилия: %s \n", element.getKey(), element.getValue());
                }
                break;
            default:
                System.out.print("Введите 1 или 2: ");
                break;       
        }
        scn.close();  
    }
}
