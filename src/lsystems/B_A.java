package lsystems;

//done 
public class B_A extends LRule{

	private final char match = 'B';
	private final char[] body = {'A'};
	
	
	public char getMatch(){
		
		return match;
	}
	
	public char[] getBody() {
		
		return body;
	}
}
