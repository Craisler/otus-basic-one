package ru.otus.java.basic.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    //    Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
    private final Map<String, HashSet<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void add(String name, String phone) {
        if (phoneBook.containsKey(name)) {
        } else {
            phoneBook.put(name, new HashSet<>(Set.of(phone)));
        }
    }

    public Set<String> find(String name) {
        return phoneBook.get(name);
    }

    public boolean containsPhoneNumber(String phone) {
        for (Map.Entry<String, HashSet<String>> set : phoneBook.entrySet()) {
            for (Object o : set.getValue()) {
                if (o.toString().equals(phone)) {
                    return true;
                }
            }
        }
        return false;
    }
}
