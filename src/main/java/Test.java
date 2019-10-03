import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.*;


public class Test {
    public static void main(String[] args) throws Exception {
        //STGroup templates = new STGroupFile("…");
      //  ST st = templates.getInstanceOf("…");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = CharStreams.fromFileName(args[0]);
        else input = CharStreams.fromStream(System.in);
	  	Zeit lex = new Zeit(input);
        Token t=null;
        do {
            t = lex.nextToken();
            if(t.getType() != Zeit.EOF) {
	System.out.println(t.getText() + " Valid: " + isValidTime(t.getText()));

            }
        } while ( t.getType()!=Token.EOF );
    }

    public static boolean isValidTime(String time){
        int stunden = Integer.parseInt(time.substring(0,2));
        int minuten = Integer.parseInt(time.substring(3,5));
        int sekunden = 0;
        if(time.length() > 5) sekunden = Integer.parseInt(time.substring(6,8));

        if(stunden > 23 | minuten > 59 | sekunden > 59) return false;

        return true;
    }
}
