import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class TestIp {
    public static void main(String[] args) throws Exception {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\Ip.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = CharStreams.fromFileName(args[0]);
        else input =  CharStreams.fromStream(System.in);
        Ipadresse lex = new Ipadresse(input);
        Token t=null;

        do {
            t = lex.nextToken();
            if(t.getType() == Ipadresse.IP && isValidIp(t.getText())) {
                ST st = templates.getInstanceOf("ip");
                st.add("ipadresse", t.getText());
                System.out.print(st.render());
            }
        } while ( t.getType()!=Token.EOF );
    }

    public static boolean isValidIp(String ip){
        String[] str = ip.split("\\.");

        for(String oktal: str)
            if (Integer.parseInt(oktal) > 255 && Integer.parseInt(oktal) >=0) return false;
        return true;
    }

}
