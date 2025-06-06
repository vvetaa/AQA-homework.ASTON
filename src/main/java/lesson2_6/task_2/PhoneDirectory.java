package lesson2_6.task_2;

import java.util.*;

public class PhoneDirectory {
    private final Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phone) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }
}
