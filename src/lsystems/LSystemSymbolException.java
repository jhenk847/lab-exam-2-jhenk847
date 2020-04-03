package lsystems;


//should be thrown if a symbol is in the sequence for which there is no rule
//(so if the letter Q is in the sequence, but no rule has Q->(something) this exception should be thrown)
public class LSystemSymbolException extends Exception{

	private char symbol;
	
	public LSystemSymbolException(char symbol) {
		this.symbol=symbol;
	}
	
	public char getSymbol() {
		return symbol;
	}
}
