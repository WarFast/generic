import java.util.ArrayList;
import java.util.List;
public class BoxList<E extends Box<?>> extends ArrayList<E> {

    public void printList() {
        PrintUtil.printList(this);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void printListSorted() {
        PrintUtil.printListSorted((List) this);
    }
}