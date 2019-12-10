import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "rvs";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		RevesLexer lexer = new revesLexer Lexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RevesParser parser = new revesLexer Parser(tokens);

		revesLexer Parser.StartContext tree = parser.start();

		revesLexer CustomVisitor visitor = new revesLexer CustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
