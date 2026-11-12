package app;

import java.util.ArrayList;
import java.util.Arrays;
import generic.Circle;
import generic.GenericMethods;

public class TestGenericMethods {
    public static void main(String[] args) {
        // 1. удаление дубликатов
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 5, 1, 3, 8, 1));
        System.out.println("Исходный список: " + numbers);
        System.out.println("Без дубликатов:  " + GenericMethods.removeDuplicates(numbers));

        ArrayList<String> words =
                new ArrayList<>(Arrays.asList("Java", "C++", "Java", "Python", "C++"));
        System.out.println("Исходный список: " + words);
        System.out.println("Без дубликатов:  " + GenericMethods.removeDuplicates(words));

        // 2. линейный поиск
        Integer[] array = {4, 8, 15, 16, 23, 42};
        System.out.println("\nМассив: " + Arrays.toString(array));
        System.out.println("Позиция 23: " + GenericMethods.linearSearch(array, 23));
        System.out.println("Позиция 7:  " + GenericMethods.linearSearch(array, 7));

        // 3. наибольший элемент в массиве кругов
        Circle[] circles = {new Circle(2.5), new Circle(7.0), new Circle(4.1)};
        System.out.println("\nКруги: " + Arrays.toString(circles));
        System.out.println("Наибольший круг: " + GenericMethods.max(circles));

        // 4. наибольший элемент в двумерном массиве
        Integer[][] matrix = {{3, 17, 6}, {25, 1, 9}, {12, 4, 20}};
        System.out.println("\nМатрица: " + Arrays.deepToString(matrix));
        System.out.println("Наибольший элемент матрицы: " + GenericMethods.max(matrix));
    }
}
