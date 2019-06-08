
public class A {
	double a(long p) {
		B b = new B();
		try {
			b.b(p);
			System.out.println("1");
		} catch (E2 e) {
			System.out.println("2");
		} catch (E3 e) {
			System.out.println("3");
		} catch (E4 e) {
			
		}
		System.out.println("4");
		return 1;
	}
}
