
public class GenerickStack<T> implements GenInterface<T> {

	//T object;
	Knoten<T> aktuellesElement;

	@Override
	public void push(T t) {
		Knoten<T> knoten = new Knoten<T>(aktuellesElement, t);
		aktuellesElement = knoten;
	}

	@Override
	public T pop() throws elementNullExeption {
		T tmp = aktuellesElement.getObjekt();
		if (aktuellesElement == null) {
			throw new elementNullExeption();
		} else {
			aktuellesElement = aktuellesElement.getVorElement();
		}
		return tmp;
	}

}
