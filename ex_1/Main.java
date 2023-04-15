package ex_1;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги
        // с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

        boolean flag = true;
        MenuHello menuHello = new MenuHello();

        while (flag) {
            flag = menuHello.hello();
        }

    }
}
