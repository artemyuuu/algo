package org.example.ArrayString;

//Входные данные
//["Рандомизированный набор", "вставить", "удалить", "вставить", "получить случайное", "удалить", "вставить", "получить случайное"]
//[[], [1], [2], [2], [], [1], [2], []]
//Выходные данные
//[null, true, false, true, 2, true, false, 2]
//
//Пояснение
//RandomizedSet randomizedSet = new RandomizedSet();
//randomizedSet.insert(1); // Вставляет 1 в набор. Возвращает true, так как 1 был успешно вставлен.
//randomizedSet.remove(2); // Возвращает false, так как 2 отсутствует в наборе.
//randomizedSet.insert(2); // Вставляет 2 в набор, возвращает true. Теперь набор содержит [1,2].
//randomizedSet.getRandom(); // getRandom() должен возвращать 1 или 2 случайным образом.
//randomizedSet.remove(1); // Удаляет 1 из набора, возвращает true.  Теперь набор содержит [2].
//randomizedSet.insert(2); // 2 уже был в наборе, поэтому возвращается false.
//randomizedSet.getRandom(); // Поскольку 2 — единственное число в наборе, getRandom() всегда будет возвращать 2.

import java.util.*;

public class RandomizedSet10 {


    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random random;

    public RandomizedSet10() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }


    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(indexToRemove,lastElement);
        map.put(lastElement, indexToRemove);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomElement = list.get(random.nextInt(list.size()));
        return randomElement;
    }
}
