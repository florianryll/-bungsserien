import java.util.ArrayList;

public class MyPhonebook<T> implements Phonebook<T> {
	ArrayList<MyPhoneEntry> entries = new ArrayList<MyPhoneEntry>();

	@Override
	public void addEntry(T newElement) {
		entries.add(newElement);
	}

	@Override
	public T getEntry(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfEntries() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfAvailablePhoneNumbers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getNumberOfUsedBytes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
