package tasktwo;

import static org.junit.Assert.*;
import org.junit.*;

import java.io.*;
import java.util.*;

public class PhoneBookTest {
    private PhoneBook phoneBook;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void SetUpPrint() {
        System.setOut(new PrintStream(outContent));
        Map<String, ArrayList<String>> book = new HashMap<>();
        book.put("Петров П.П.", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        phoneBook = new PhoneBook(book);
    }

    @After
    public void CleanUpPrint(){
        phoneBook = null;
        System.setOut(null);
    }

    @Test
    public void TestNullPrint() {
        boolean result = true;
        try {
            phoneBook.Print(null);
        } catch (Exception ex) {
            result = false;
        }
        assertTrue("Тест на пустое значение не пройден", result);
    }

    @Test
    public void TestTruePrint() {
        phoneBook.Print("Петров П.П.");
        assertEquals("+8 800 2000 700\n", outContent.toString());
    }

    @Test
    public void TestFalsePrint() {
        phoneBook.Print("Не Петров П.П.");
        assertEquals("ФИО нет в БД\n", outContent.toString());
    }
}