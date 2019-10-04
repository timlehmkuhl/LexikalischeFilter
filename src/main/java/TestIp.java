import org.antlr.v4.runtime.*;

public class TestIp {
    public static void main(String[] args) throws Exception {
        //STGroup templates = new STGroupFile("…");
        //  ST st = templates.getInstanceOf("…");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (args.length>0) input = CharStreams.fromFileName(args[0]);
        else input =  CharStreams.fromStream(System.in);
        Ipadresse lex = new Ipadresse(input);
        Token t=null;
        do {
            t = lex.nextToken();
            if(t.getType() != Ipadresse.EOF) {
                System.out.print(t.getText() + " Valid: " + isValidIp(t.getText()));
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
