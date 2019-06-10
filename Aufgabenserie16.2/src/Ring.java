
public class Ring<X> {
	int maxSize;
	Element current;

	public Ring(int maxSize) throws maxSizeSmallerThenOneExeption {
		if (maxSize < 1) {
			throw new maxSizeSmallerThenOneExeption();
		}
		this.maxSize = maxSize;
	}

	public void add() throws elementEQNullExeption, maxSizeIsReachedExeption {

		Element tmp = current;
		int elementCount = 0;
		try {
			do {
				elementCount++;
			} while (next() != tmp);
			if (elementCount == maxSize) {
				throw new maxSizeIsReachedExeption();
			} else {
				current.insertAfter();
				
			}
		} catch (noElementInRingExeption e) {
			current = new Element();
		}
	}

	public Element current() {
		return current;
	}

	public Element next() throws noElementInRingExeption {
		if (current == null) {
			throw new noElementInRingExeption();
		}
		Element tmp = current.next();
		current = current.next();
		return tmp;
	}
}
