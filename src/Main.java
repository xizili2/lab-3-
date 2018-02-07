import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Here");
        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt "));
    }
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static int urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return -1;
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        int theTimes = 0;
        while(contents.contains("the") ){
            theTimes += 1;
            contents = contents.substring(contents.indexOf("the") + 3);




        }
        return theTimes;

    }
}

