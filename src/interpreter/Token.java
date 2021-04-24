package interpreter;

public class Token {
	private final TokenType type;
	private final String lexeme;
	private final Object literal;
	private final int line;

	public Token(TokenType type, String lexeme, Object literal, int line) {
		super();
		this.type = type;
		this.lexeme = lexeme;
		this.literal = literal;
		this.line = line;
	}

	@Override
	public String toString() {
		return "Token [type=" + type + ", lexeme=" + lexeme + ", literal=" + literal + ", line=" + line + "]";
	}
}
