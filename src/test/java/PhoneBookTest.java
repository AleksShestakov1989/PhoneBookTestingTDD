import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private static PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addRepeatContact() {
        final int expected = 2;
        phoneBook.add("One", "111");
        phoneBook.add("Two", "222");
        final int actual = phoneBook.add("One", "333");
        assertEquals(expected, actual);
    }

    @Test
    public void findByNumber() {
        final String expected = "Two";
        final String actual = phoneBook.findByNumber("222");
        assertEquals(expected, actual);
    }

    @Test
    public void findByName() {
        final String expected = "111";
        final String actual = phoneBook.findByName("One");
        assertEquals(expected, actual);
    }

    @Test
    public void printAllNames() {
        final String[] expected ={"One","Two"};
        final List<String> actual=phoneBook.printAllNames();
        assertThat(actual,contains(expected));
    }

}
