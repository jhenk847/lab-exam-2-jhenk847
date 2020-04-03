package lsystems;


//should be thrown if a symbol is in the sequence for which there is no rule
//(so if the letter Q is in the sequence, but no rule has Q->(something) this exception should be thrown)
public class LSystemSymbolException extends Exception{
	
	public String getSymbol() {
		return "Invalid symbol" ;
	}
}
