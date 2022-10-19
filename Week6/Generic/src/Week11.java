
import java.util.ArrayList;
import java.util.List;

public class Week11 {
    /**
     * .
     *
     * @param myList .
     * @param <T> .
     * @return .
     */
    public static <T> List<T> sortGeneric(List<T> myList) {
        myList.sort((x, y) -> {
            if (x instanceof Integer) {
                return ((Integer) x).compareTo((Integer) y);
            }
            if (x instanceof Person) {
                return ((Person) x).compareTo((Person) y);
            }
            if (x instanceof String) {
                return ((String) x).compareTo((String) y);
            }
            return 0;
        });
        return myList;
    }
}