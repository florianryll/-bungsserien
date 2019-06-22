import java.util.List;

public interface SortedArchive<Item extends Comparable<Item>> {
	public void addItem(Item item);

	public List<Item> getAllSortedItems();
}