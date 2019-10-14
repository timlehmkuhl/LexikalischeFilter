import java.io.IOException;

public class MainIp {
    public static void main(String[] args) throws IOException {
        TestIp ip = new TestIp();
        String ret = ip.run("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\inputIP.txt", true);
        String ret2 = ip.run("1.1.1.199" + "2.2.2.2", false);
        System.out.println(ret);

    }
}
