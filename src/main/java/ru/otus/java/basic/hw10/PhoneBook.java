package ru.otus.java.basic.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    //    Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
    private final Map<String, Set<String>> phoneBook = new HashMap<>(); // HashSet -> Set

    public void add(String name, String phone) { // добавления нет -))
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            phoneBook.put(name, new HashSet<>(Set.of(phone)));
        }
    }

    public Set<String> find(String name) {
        return phoneBook.get(name);
    }

    /**
     * Медленный поиск
     * @param phone
     * @return
     */
    public boolean containsPhoneNumberV1SLOW(String phone) {
        for (Map.Entry<String, Set<String>> set : phoneBook.entrySet()) {
            for (Object o : set.getValue()) {
                if (o.toString().equals(phone)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Быстрый поиск
     * @param phone
     * @return
     */
    public boolean containsPhoneNumberV2FAST(String phone) {
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                return true;
            }
        }
        return false;
    }
}
