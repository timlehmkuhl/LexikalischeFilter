import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.*;


public class Test {
    public static void main(String[] args) throws Exception {
        //STGroup templates = new STGroupFile("…");
      //  ST st = templates.getInstanceOf("…");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
	  	ZeitLexer lex = new ZeitLexer(input);
        Token t=null;
        do {
            t = lex.nextToken();
            if(t.getType() != ZeitLexer.EOF) {
	System.out.println(t.getText());
            }
        } while ( t.getType()!=Token.EOF );
    }
}
