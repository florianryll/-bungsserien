import java.util.ArrayList;

public class MyPhonebook<T extends MyPhoneEntry> implements Phonebook<T> {
	ArrayList<MyPhoneEntry> entries = new ArrayList<MyPhoneEntry>();
	MyStatistics statistics = new MyStatistics();

	@Override
	public void addEntry(T newElement) {
		entries.add(newElement);
		statistics.captureStatistics(newElement);
	}

	@Override
	public T getEntry(int i) {
		return (T) entries.get(i);
	}

	@Override
	public int getNumberOfEntries() {
		return entries.size();
	}

	@Override
	public int getNumberOfAvailablePhoneNumbers() {
		return statistics.returnNumberOfAvailablePhoneNumber();
	}

	@Override
	public long getNumberOfUsedBytes() {
		return statistics.returnNumberOfUsedBytes();
	}

	private class MyStatistics implements Statistics {
		int numberOfAvailablePhoneNumbers;
		long numberOfUsedBytes;

		public int returnNumberOfAvailablePhoneNumber() {
			return numberOfAvailablePhoneNumbers;
		}

		public long returnNumberOfUsedBytes() {
			return numberOfUsedBytes;
		}

		@Override
		public void captureStatistics(PhoneEntry myPhoneEntry) {
			numberOfAvailablePhoneNumbers = this.getNumberOfAvailablePhoneNumbers();
			numberOfUsedBytes = this.getNumberOfUsedBytes();
		}

		@Override
		public int getNumberOfAvailablePhoneNumbers() {
			int numberOfPhoneNumbers = 0;
			for (MyPhoneEntry entrie : entries) {
				try {
					if (entrie.getPhoneNumber() != null) {
						numberOfPhoneNumbers++;
					}
				} catch (noPhoneNumberSavedExeception e) {
				}
			}
			return numberOfPhoneNumbers;
		}

		@Override
		public long getNumberOfUsedBytes() {
			long numberOfUsedBytes = 0;
			for (MyPhoneEntry entrie : entries) {
				numberOfUsedBytes += entrie.getName().getBytes().length;
				try {
					if (entrie.getPhoneNumber() != null) {
						numberOfUsedBytes += entrie.getPhoneNumber().getBytes().length;
					}
				} catch (noPhoneNumberSavedExeception e) {
				}
			}
			return numberOfUsedBytes;
		}

	}
}
