import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.*;


public class TestZeit {
    public static void main(String[] args) throws Exception {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\zeit.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = CharStreams.fromFileName(args[0]);
        else input = CharStreams.fromStream(System.in);
	  	Zeit lex = new Zeit(input);
        Token t=null;

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

                System.out.println(st.render());

            }
        } while ( t.getType()!=Token.EOF );
    }



    public static boolean isValidTime(String time){
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
