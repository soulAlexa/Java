package lr3;

public class except extends RuntimeException {
	private String text;
	
	public except(String s) {
		text = s;
	}

	public String getMessage() {
		return text;
	}
}
