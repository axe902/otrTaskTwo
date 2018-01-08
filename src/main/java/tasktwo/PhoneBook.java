package tasktwo;

import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> book = new HashMap<>();

    PhoneBook(){
        book.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        book.put("Петров П.П.", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        book.put("Сидоров С.С.", new ArrayList<>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
    }

    PhoneBook(Map<String, ArrayList<String>> book){
        this.book=book;
    }

    public void Print (String fio) {
        ArrayList<String> phones = book.get(fio);

        if (phones != null)
            for (int i = 0; i < phones.size(); i++)
            {
                System.out.printf("%s\n",phones.get(i));
            }
        else
            System.out.print("ФИО нет в БД\n");

    }
}
