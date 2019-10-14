import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.*;

import java.io.IOException;


public class TestZeit {

    public TestZeit() {
    }

    public String run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\zeit.stg");

        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

	  	Zeit lex = new Zeit(input);
        Token t=null;
        String ret = "";

        do {
            t = lex.nextToken();
            if(t.getType() == Zeit.TIME && isValidTime(t.getText())) {
	           // System.out.println(t.getText() + " Valid: " + isValidTime(t.getText()));
              /*  st.add("stunden", t.getText().substring(0,2));
	            st.add("minuten", t.getText().substring(3,5));
                st.add("sekunden", t.getText().substring(6,8));
                st.add("doppelpunkt", t.getText().charAt(2));*/

                ST st = templates.getInstanceOf("zeit");
                st.add("zeiteinheit", t.getText());

                ret = ret + st.render() + "\n";

            }
        } while ( t.getType()!=Token.EOF );
        return ret.length() > 0 ? ret.substring(0,ret.length()-1) : ret;
    }



    public boolean isValidTime(String time){
        int stunden = Integer.parseInt(time.substring(0,2));
        int minuten = Integer.parseInt(time.substring(3,5));
        int sekunden = 0;
        if(time.length() > 5) sekunden = Integer.parseInt(time.substring(6,8));

        if((stunden > 23 && stunden >=0) | (minuten > 59 && minuten >=0) | (sekunden > 59 && sekunden >=0)){
            System.err.println(time + " ist Keine gueltige Uhrzeit!");
            return false;
        }

        return true;
    }
}
