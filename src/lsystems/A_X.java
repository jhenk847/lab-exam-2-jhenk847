package lsystems;

//not sure if this one is right 
public class A_X extends LRule{
	
	private final char match = 'A';
	private final char[] body = {' '};
	
	public char getMatch(){
		
		return match;
	}
	
	public char[] getBody() {
		
		return body;
	}

}
