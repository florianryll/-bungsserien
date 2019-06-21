
public class TextNotValide extends Exception {
	public TextNotValide(String falseInput, char wrongBracket, int position) {
		super("Das Zeichen '"+wrongBracket+"' an Stelle "+position+" in "+falseInput+" hat den Fehler ausgelöst.");
	}
}
