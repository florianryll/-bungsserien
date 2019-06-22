
public class Knight extends Person{
	public Knight(String name, Namebook namebook) {
		super(name, namebook,Gender.male);
	}
	public Knight( Namebook namebook) {
		super(namebook,Gender.male);
	}
}
