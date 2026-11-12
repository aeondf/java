package generic;

import java.util.ArrayList;

// обобщённые (generic) методы: работают с любым типом E, который подставит компилятор
public class GenericMethods {

    /** Возвращает новый список без дубликатов, исходный список не меняется */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) { // contains() из интерфейса List
                result.add(element);
            }
        }
        return result;
    }

    /** Линейный поиск: возвращает индекс элемента key или -1, если его нет */
    public static <E> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    /** Наибольший элемент массива; E обязан уметь сравниваться (Comparable) */
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    /** Наибольший элемент двумерного массива */
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for (E[] row : list) {
            for (E element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }
}
