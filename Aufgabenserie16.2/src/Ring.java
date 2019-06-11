
public class Ring<X> {
	int maxSize;
	Element<X> current;

	public Ring(int maxSize) throws maxSizeSmallerThenOneExeption {
		if (maxSize < 1) {
			throw new maxSizeSmallerThenOneExeption();
		}
		this.maxSize = maxSize;
	}

	public void add(X content) throws maxSizeIsReachedExeption {

		Element<X> tmp = current;
		int ElementCount = 0;
		try {
			do {
				ElementCount++;
			} while (next() != tmp);
			if (ElementCount == maxSize) {
				throw new maxSizeIsReachedExeption();
			} else {
				current.insertAfter(content);
				
			}
		} catch (noElementInRingExeption e) {
			current = new Element<X>(content);
		}
	}

	public Element<X> current() {
		return current;
	}

	public Element<X> next() throws noElementInRingExeption {
		if (current == null) {
			throw new noElementInRingExeption();
		}
		Element<X> tmp = current.next();
		current = current.next();
		return tmp;
	}
}
