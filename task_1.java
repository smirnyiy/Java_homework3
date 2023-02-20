// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 15;
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers.toString());

        for (int i = 0; i < numbers.size(); i++) {
            // Integer number = iterator.next();
            if (numbers.get(i) % 2 == 0 ) {
                 numbers.remove(numbers.get(i));        
                i--;}

        }
        System.out.println(numbers.toString());
        }
}