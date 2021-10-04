import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        String str = "<img src=\"https://www.forbesindia.com/media/celeblist2019/small/0011_Virat Kohli.jpg\" alt=\"Virat Kohli\" title=\"Virat Kohli\" class=\"rounded\">";
        Pattern pattern = Pattern.compile("alt=\"(.*?)\"");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.println(m.group(1));
        }
        pattern = Pattern.compile("https(.*?)jpg");

        m = pattern.matcher(str);

        while (m.find()) {
            System.out.println(m.group(0));
        }
    }

}
