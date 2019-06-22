
public class Princess extends Person{

	public Princess(String name, Namebook namebook) {
		super(name, namebook,Gender.female);
	}
	public Princess( Namebook namebook) {
		super(namebook,Gender.female);
	}
}
