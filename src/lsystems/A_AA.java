package lsystems;

//done
public class A_AA extends LRule{
	
	private final char match = 'A';
	private final char[] body = {'A', 'A'};
	
	
	public char getMatch(){
		
		return match;
	}
	
	public char[] getBody() {
		
		return body;
	}

}
