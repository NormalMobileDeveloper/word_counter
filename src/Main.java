import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       var main = new Main();
        main.workCounter("hello world qwerty world", 2);
    }

    public void workCounter(String str, int n) {
        Map<String, Integer> map = new HashMap<>();

        for(String st: str.split("\\s+")) {
            var count = map.getOrDefault(st,0);

            if(n == ++ count)  {
                System.out.println(st);
                return;
            }

            map.put(st, count);
        }
        System.out.println("The text didn't have this count words");
    }
}