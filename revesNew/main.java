import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.backwardslanguage.reves.reves.RevesParserParser;


public class main {
	private static String load(String preCodeFile) 
			  throws java.io.IOException {
		return new String(
				java.nio.file.Files.readAllBytes(
						java.nio.file.Paths.get(preCodeFile)), 
				java.nio.charset.Charset.forName("UTF-8"));
	}
	public static void main(String[] args) {
		RevesParserParser parser = null;
		try {
			ANTLRInputStream input= new ANTLRInputStream ( load("test.rvs"));
			RevesParserLexer lexer =new RevesParserLexer(input);
			CommonTokenStream tokens=new CommonTokenStream(lexer);
			parser = new RevesParserParser(tokens);
			ParseTree tree = parser.program();
			//sem <_________________________________________
			
		

		System.out.println("Interpretation finished");
		
		} catch (Exception e) {
			System.err.print(e);
		}
	}
	
	

}
