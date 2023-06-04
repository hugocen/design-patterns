package iterator.Menu.Iterator;

import java.util.List;

import iterator.Menu.Menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    // Implement Iterator methods
    public boolean hasNext() {
        return items.size() > position;
    }

    public MenuItem next() {
        return items.get(position++);
    }
}
