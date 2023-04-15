package ex_1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MenuHello {

    Map<String, String> phoneBoock = new HashMap<>();

    boolean hello() {

        System.out.println("1. Добавить контакт");
        System.out.println("2. Посмотреть телефонную книгу");
        System.out.println("3. Выход");
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.nextLine();

        if (choise.equals("1")) {
            System.out.println("Введите номер телефона: ");
            String phone = scanner.nextLine();
            System.out.println("Введите фамилию: ");
            String name = scanner.nextLine();
            phoneBoock.put(phone, name);
            return true;
        }
        if (choise.equals("2")) {
            int count = 1;
            for (String name : phoneBoock.keySet()) {
                String key = name.toString();
                String value = phoneBoock.get(name).toString();
                System.out.println(count + ". " + key + " " + value);
                count++;
            }
            return true;
        }

        else {
            return false;
        }

    }

    // @Override
    // public String toString() {
    // return;
    // }
}
