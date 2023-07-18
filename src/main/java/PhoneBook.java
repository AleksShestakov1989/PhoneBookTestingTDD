import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        } else {
            System.out.println("Contact repeat");
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return "Number is bad";
    }

    public static String findByName(String name) {
        return phoneBook.get(name);
    }

    public static List<String> printAllNames() {
        List<String> list = new ArrayList<>();
        list.addAll(phoneBook.keySet());
        return list;
    }
}
