import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> stringMap = new TreeMap<>();

        stringMap.put("firstname" , "farzad");
        stringMap.put("lastname" , "afshar");
        stringMap.put("username" , "farzadafi");
        stringMap.put("firstname" , "Alireza");

        System.out.println(stringMap.get("firstname"));
        Set<String> strings = stringMap.keySet();
        System.out.println(strings);
    }
}
