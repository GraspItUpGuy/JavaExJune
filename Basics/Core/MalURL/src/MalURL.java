import java.net.MalformedURLException;
import java.net.URL;

public class MalURL {
    public static void main(String[] args){
        try {
            URL myUrl =  new URL("ftp://google.com");
            System.out.println("URL protocol : " + myUrl.getProtocol());
        }catch (MalformedURLException e){
            System.out.println("correct the protocol " + e);
        }


    }
}
