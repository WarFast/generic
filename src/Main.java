public class Main {
    public static void main(String[] args) {
       BoxList<Box<Integer>> myList = new BoxList<>();

        myList.add(new Box<>(500));
        myList.add(new Box<>(123));
        myList.add(new Box<>(999));

        System.out.println("Print Biasa");
        myList.printList();

        System.out.println("Print Sorted");
        myList.printListSorted();

        System.out.println("Cek List Asli");
        myList.printList();
    }
}