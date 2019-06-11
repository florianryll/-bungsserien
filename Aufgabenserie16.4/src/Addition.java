
public class Addition<T extends Number> extends ZweiArgument<T> {

	public Addition(T links, T rechts) {
		super(links, rechts);
	}

	@Override
	public Number getCalculatedValue() {
		return links.intValue()+rechts.intValue();
	}

}
