import java.util.*;

public class Interview {


    public static void main(String[] args) {

        albino("hello", "olleh");
        albino("loop", "pool");
        albino("AsAp", "PaSa");
    }

    public static boolean albino(String str1, String str2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c : str1.toCharArray()) {
            list1.add(c);
        }

        for (char c : str2.toCharArray()) {
            list2.add(c);
        }

        boolean result = list2.size() == list1.size() && (list2.containsAll(list1));

        System.out.println(str1 + " : " + str2 + " = " + result);

        return result;


    }


}

