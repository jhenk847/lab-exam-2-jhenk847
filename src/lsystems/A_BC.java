package lsystems;

//done
public class A_BC extends LRule{
	
	private final char match = 'A';
	private final char[] body = {'B', 'C'};
	
	public char getMatch(){
		
		return match;
	}
	
	public char[] getBody() {
		
		return body;
	}

}
