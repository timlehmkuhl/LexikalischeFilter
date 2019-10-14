import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class TestIp {

    public TestIp() {
    }

    public String run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\Ip.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

        Ipadresse lex = new Ipadresse(input);
        Token t=null;
        String ret = "";

        do {
            t = lex.nextToken();
            if(t.getType() == Ipadresse.IP && isValidIp(t.getText())) {
                ST st = templates.getInstanceOf("ip");
                st.add("ipadresse", t.getText());
                ret = ret + st.render() + "\n";
            }
        } while ( t.getType()!=Token.EOF );
        return  ret.length() > 0 ? ret.substring(0,ret.length()-1) : ret;
    }


    public boolean isValidIp(String ip){
        String[] str = ip.split("\\.");

        for(String oktal: str)
            if (Integer.parseInt(oktal) > 255 && Integer.parseInt(oktal) >=0){
                System.err.println(ip + " ist keine gueltige IP!");
                return false;
            }
        return true;
    }

}
