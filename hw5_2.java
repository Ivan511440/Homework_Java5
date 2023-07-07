// Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, 
// Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
// Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, 
// Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hw5_2{
    public static void main(String[] args) {
       String[] employees = {"Иван Иванов",
                                            
                            "Светлана Петрова",
                            
                            "Кристина Белова",
                            
                            "Анна Мусина",
                            
                            "Анна Крутова",
                            
                            "Иван Юрин",
                            
                            "Петр Лыков",
                            
                            "Павел Чернов", 
                            
                            "Петр Чернышов",
                            
                            "Мария Федорова",
                             
                            "Марина Светлова",
                            
                            "Мария Савина", 
                            
                            "Мария Рыкова", 
                            
                            "Марина Лугова",
                            
                            "Анна Владимирова", 
                            
                            "Иван Мечников",
                            
                            "Петр Петин", 
                            
                            "Иван Ежов"}; 

    Map<String, Integer> counts = new HashMap<>();
    for (String employee : employees) {
        if (counts.containsKey(employee)) {
            counts.put(employee, counts.get(employee) + 1);
        }
        else{
            counts.put(employee, 1);
        }
    }
    Map<String, Integer> sortedCounts = new TreeMap<>((e1, e2) -> counts.get(e2).compareTo(counts.get(e1)));
    sortedCounts.putAll(counts);
    for (Map.Entry<String, Integer> entry : sortedCounts.entrySet()) {
        String name = entry.getKey();
        int count = entry.getValue();
        if (count > 1) {
            System.out.println(name + ": " + count);
        }
    }
  }
}
