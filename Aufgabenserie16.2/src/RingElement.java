public interface RingElement {
	public RingElement next();

	public void insertAfter(Object object);

	public void delete();

	public int getId();
}