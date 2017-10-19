public class reverseString {
    String testString;

    public static String reverse(String s) {
        // get length of string
        int n = s.length();
        // convert to a chartacter array
        char[] a = s.toCharArray();
        // start for loop to iterate over the string backwards
        for (int i = 0; i < n/2; i++) {
            char temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(reverse(args[0]));
    }
}