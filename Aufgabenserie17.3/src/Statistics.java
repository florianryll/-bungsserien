public interface Statistics {
	/*** erfasst das uebergebene Objekt in der Statistik** @param myPhoneEntry */
	public void captureStatistics(PhoneEntry myPhoneEntry);

	/*** liefert die Anzahl der gespeicherten Telefonnummern** @return */
	public int getNumberOfAvailablePhoneNumbers();

	/***
	 * liefert den Speicherplatzbedarf (bzw. eine Abschaetzung) in Bytes** @return
	 */
	public long getNumberOfUsedBytes();
}