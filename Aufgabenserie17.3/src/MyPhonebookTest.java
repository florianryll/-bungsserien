import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyPhonebookTest {

	@Test
	void test() {
		MyPhonebook<MyPhoneEntry> a= new MyPhonebook<MyPhoneEntry>();
		a.addEntry(new MyPhoneEntry("flo", "5785"));
		System.out.println(a.getNumberOfAvailablePhoneNumbers());
		System.out.println(a.getNumberOfEntries());
		System.out.println(a.getNumberOfUsedBytes());
		a.addEntry(new MyPhoneEntry("jö"));
		System.out.println(a.getNumberOfAvailablePhoneNumbers());
		System.out.println(a.getNumberOfEntries());
		System.out.println(a.getNumberOfUsedBytes());
	}
}
