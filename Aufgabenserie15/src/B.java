
public class B {
	double b(long p) throws E2, E3, E4 {
		C c = new C();
		try {
			return c.c(p);
		} catch (E1 e) {
			throw new E4();
		}
	}
}
