package ml.bibek.twelve.iterator;

import java.util.List;

public class PancakeIterator implements Iterator {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public PancakeIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position <  menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
