import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
}
