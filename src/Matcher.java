

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher {
    public static void main(String[] args) {
        String text = "name@gmail.com @gmail.com";
        Pattern pattern = Pattern.compile("^[A-Za-z0-99+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}