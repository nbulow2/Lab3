package killmeLab3;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Lab3
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("URL: ");
        String url = scan.next();
        String content = urlToString(url);
        int bigNum =  content.split("\\s+").length;
        System.out.println("Number of words: " + bigNum);
        scan.close();


    }
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

}

