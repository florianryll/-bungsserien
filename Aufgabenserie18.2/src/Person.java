
public abstract class Person {
	String name;
	Namebook namebook;
	Gender gender;
	public Person(String name, Namebook namebook,Gender gender) {
		super();
		this.gender = gender;
		this.namebook = namebook;
		try {
			namebook.addName(name);
		} catch (nameAlreadyExisits e) {
			e.printStackTrace();
		}
		this.name = name;
	}
	public Person(Namebook namebook,Gender gender) {
		super();
		this.namebook = namebook;
		name =namebook.giveName(gender);
		try {
			namebook.addName(name);
		} catch (nameAlreadyExisits e) {
			e.printStackTrace();
		}
	}
}
