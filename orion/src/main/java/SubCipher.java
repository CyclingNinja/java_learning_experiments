import java.util.Map;
import java.util.TreeMap;

public class SubCipher {

    public Map<Character, Character> cipher(String[] args) {
        String message = new String(args[0]);
        String key = new String(args[1]);

        // instantiate the lookup tree map
        TreeMap<Character, Character> cipherMap =
                new TreeMap<Character, Character>();

        // check that the two strings are the same length
        if (message.length() == key.length()) {
            for (int index = 0; index < message.length(); index++) {
                cipherMap.put(message.charAt(index), key.charAt(index));
                }
        } else {
            System.out.println("Non 1-to-1 phrase key to map relationship");
        }

        System.out.print(cipherMap.toString());

        return cipherMap;
    }

    public String decrypt(String code, Map cipherMap) {
        for (int i = 0; i < code.length(); i++) {
            
        }
                (Map.Entry entry : cipherMap.entrySet()) {
            if(value)

        }


        return test;
    }

//    public static void main(String[] args) {

//    }

}