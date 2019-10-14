import java.io.IOException;

public class MainZeit {
    public static void main(String[] args) throws IOException {
        TestZeit zeit = new TestZeit();
        String ret = zeit.run("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\inputZeit.txt", true);
        String ret2 = zeit.run("22:22" + "23:29", false);
        System.out.println(ret);

    }
}
