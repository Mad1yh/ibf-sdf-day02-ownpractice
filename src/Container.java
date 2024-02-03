import java.util.ArrayList;
import java.util.List;

public class Container<T> {

    private List<T> items;

    public Container() {
        items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void addItem (T item) {
        items.add(item);
    }
    }

    

    


