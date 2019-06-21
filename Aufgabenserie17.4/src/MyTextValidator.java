import java.util.Stack;

public class MyTextValidator implements TextValidator {

	Stack<Character> mystack = new Stack<Character>();

	@Override
	public void validate(String input) throws TextNotValide {
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '(':
				mystack.push(input.charAt(i));
				break;
			case '{':
				mystack.push(input.charAt(i));
				break;
			case '[':
				mystack.push(input.charAt(i));
				break;
			case ')':
				if (mystack.peek() == '(') {
					mystack.pop();
				} else {
					throw new TextNotValide(input, input.charAt(i), i+1);
				}
				break;
			case '}':
				if (mystack.peek() == '{') {
					mystack.pop();
				} else {
					throw new TextNotValide(input, input.charAt(i), i+1);
				}
				break;
			case ']':
				if (mystack.peek() == '[') {
					mystack.pop();
				} else {
					throw new TextNotValide(input, input.charAt(i), i+1);
				}
				break;
			default:
				break;
			}
		}
		if (mystack.size() > 0) {
			switch (mystack.peek()) {
			case '(':
				throw new TextNotValide(input, ')', input.length());
			case '{':
				throw new TextNotValide(input, '}', input.length());
			case '[':
				throw new TextNotValide(input, ']', input.length());
			}
		}

	}
}
