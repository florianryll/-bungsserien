
public abstract class ZweiArgument<T> implements Rechnen{
	T links;
	T rechts;
	public ZweiArgument(T links, T rechts) {
		super();
		this.links = links;
		this.rechts = rechts;
	}
}
