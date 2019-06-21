import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTextValidatorTest {

	@Test
	void test() {
		MyTextValidator a = new MyTextValidator();
		try {
			a.validate("()()[([{]{[[}{]{}]}]]");
		} catch (TextNotValide e1) {
			
			e1.printStackTrace();
		}
		try {
			a.validate(
					"Es ist die Aufgabe, eine Eingabe (DatentypString) zuuberprufen. Die Eingabe ist genaudann valide, wenn alle Arten von Klammern (also:”(“,”)“,”{“,”}“,”[“,”]“) sog. Klam-merpaare ergeben (also z. B.”(“ und”)“), also insbesondere wenn jeder Bereich der Eingabe,welcher durch eine Klammer geoffnet wird, auch wieder durch eine passende Klammer ge-schlossen wird. Unsere Anwendung soll das InterfaceDocumentValidatorimplementieren.");
		} catch (TextNotValide e) {
			e.printStackTrace();
		}
	}

}
