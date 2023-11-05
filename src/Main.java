package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Додавання чисел до списку
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Використання ListIterator для збільшення значень на 1
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int currentValue = iterator.next();
            iterator.set(currentValue + 1);
        }

        // Виведення оновленого списку
        System.out.println("Список чисел після збільшення на 1:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
