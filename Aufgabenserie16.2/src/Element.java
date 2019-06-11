import java.util.Random;

public class Element<X> implements RingElement {
	Element<X> successor = this;
	int id;
	X content;

	public Element(X content) {
		this.content = content;
		Random rng = new Random();
		this.id = rng.nextInt();
	}

	@Override
	public Element<X> next() {
		return successor;
	}

	@Override
	public void insertAfter(Object x) {
		Element<X> insert = new Element<X>((X) x);
		insert.setSuccessor(successor);
		this.setSuccessor(insert);
	}

	@Override
	public void delete() {
		Element<X> tmp = successor;
		while (tmp.next() != this) {
			tmp = tmp.next();
		}
		tmp.setSuccessor(this.next());
	}

	@Override
	public int getId() {
		return id;
	}

	public void setSuccessor(Element<X> successor) {
		this.successor = successor;
	}

	

}
