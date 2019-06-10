
public class GenerickStack<T> implements GenInterface<T>{

	T object;
	Knoten<T> aktuellesElement;
	@Override
	public void push(T t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T pop() {
		T tmp = aktuellesElement.getObjekt();
		
		
		return tmp;
	}
	
}
