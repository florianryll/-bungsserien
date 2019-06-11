
public class Knoten<T> {

	Knoten<T> vorElement = null;
	T objekt;
	
	
	public Knoten(Knoten<T> vorElement, T objekt) {
		super();
		this.vorElement = vorElement;
		this.objekt = objekt;
	}
	
	public Knoten<T> getVorElement() {
		return vorElement;
	}
	public T getObjekt() {
		return objekt;
	}
	
	
}
