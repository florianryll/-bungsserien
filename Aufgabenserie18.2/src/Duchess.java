
public class Duchess extends Person{

	public Duchess(String name, Namebook namebook) {
		super(name, namebook,Gender.female);
	}
	public Duchess( Namebook namebook) {
		super(namebook,Gender.female);
	}

}
