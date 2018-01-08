package tasktwo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneBook phbook = new PhoneBook();
        String fio;

        System.out.println("exit - выход");
        do {
            System.out.print("Введите ФИО: ");
            fio = in.nextLine();
            if (!Objects.equals(fio, "exit")) {
                phbook.Print(fio);
            }
        } while (!Objects.equals(fio, "exit"));
    }
}
