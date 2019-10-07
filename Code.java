package mp1;

public class Code {
	private String myCode;
	private String oldCode;
	
	public Code (String code) {
		myCode = code;
		oldCode = code;
	}
	
	public String getCode() {
		return myCode;
	}
	
	public void hide (int p1, int p2) {
		for (int i = p1; i <= p2; i++) {
			x = myCode.substring(i, i++)
			myCode.substring(i, i++) = "X";
		}
	}
	
}
