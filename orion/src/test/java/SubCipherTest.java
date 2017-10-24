import org.junit.*;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SubCipherTest {

    @Test
    public void simpleString() {
        String keyMessage = "ABCDE";
        String keyResult = "VWXYZ";
        String[] messagePair;
        messagePair = new String[]{keyMessage, keyResult};

//        pass the strings into the cipher maker
        Map<Character, Character> testKCT = new SubCipher().cipher(messagePair);

        Set set = testKCT.entrySet();
        Iterator iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Map.Entry keyValPair = (Map.Entry)iterator.next();
            assertEquals(keyValPair.getKey(), keyMessage.charAt(i));
            assertEquals(keyValPair.getValue(), keyResult.charAt(i));
            i = i + 1;
        }
    }

    @Test
    public void decryptTest() {
        // set up the cipher
        String keyMessage = "THEQUICKBROWN";
        String keyResMap =  "FXJMPSVLAZYDG";
        String[] messagePair;
        messagePair = new String[] {keyMessage, keyResMap};

        Map<Character, Character> testCrypt = new SubCipher().cipher(messagePair);

        // test phrase
        String expected = "BRAWN";
        String message = "AZFDG";

        String decryptRes = new SubCipher().decrypt(message, testCrypt);

        assertEquals(expected, decryptRes);
    }
}