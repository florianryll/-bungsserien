public interface Phonebook<T> {
	public void addEntry(T newElement);

	public T getEntry(int i);

	/*** liefert die Anzahl der gespeicherten Adresseintraege** @return */
	public int getNumberOfEntries();

	/*** liefert die Anzahl der gespeicherten Telefonnummern** @return */
	public int getNumberOfAvailablePhoneNumbers();

	/***
	 * liefert den Speicherplatzbedarf (bzw. eine Abschaetzung) in Bytes** @return
	 */
	public long getNumberOfUsedBytes();
}