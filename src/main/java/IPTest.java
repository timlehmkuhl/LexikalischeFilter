import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class IPTest {
    public static void main(String[] args) throws Exception {
        //STGroup templates = new STGroupFile("…");
        //  ST st = templates.getInstanceOf("…");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        IpadresseLexer lex = new IpadresseLexer(input);
        Token t=null;
        do {
            t = lex.nextToken();
            if(t.getType() != IpadresseLexer.EOF) {
                System.out.print(t.getText());
            }
        } while ( t.getType()!=Token.EOF );
    }
}
