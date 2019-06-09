
public class Ring<X extends Element> {
	int maxSize;
	X current;

	public Ring(int maxSize) throws maxSizeSmallerThenOneExeption {
		if (maxSize < 1) {
			throw new maxSizeSmallerThenOneExeption();
		}
		this.maxSize = maxSize;
	}

	public void add() throws elementEQNullExeption, maxSizeIsReachedExeption {

		X tmp = current;
		int elementCount = 0;
		try {
			do {
				elementCount++;
			} while (next() != tmp);
		} catch (noElementInRingExeption e) {
			current = new X();
		}
		if (elementCount == maxSize) {
			throw new maxSizeIsReachedExeption();
		} else {
			current.insertAfter();
		}
	}

	public X current() {
		return current;
	}

	public X next() throws noElementInRingExeption {
		if (current == null) {
			throw new noElementInRingExeption();
		}
		X tmp = current;
		current = (X) current.next();
		return tmp;
	}
}
