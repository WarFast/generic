import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintUtil {

    public static <T> void printList(List<T> list) {
        for (T item : list) System.out.println(item);
    }

    public static <T> void printList(T[] array) {
        for (T item : array) System.out.println(item);
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        for (T item : list) System.out.println(item.getPrintDetail());
    }

    public static <T extends Comparable<? super T>> void printListSorted(List<T> list) {
        List<T> copyList = new ArrayList<>(list);
        Collections.sort(copyList);
        for (T item : copyList) System.out.println(item);
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] array) {
        T[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        for (T item : copyArray) System.out.println(item);
    }
}