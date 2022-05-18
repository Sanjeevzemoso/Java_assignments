import java.util.Arrays;
import java.util.Scanner;
/* Time Complexity      -  in terms of big O -->O(len(input))
    Space complexity    -  in terms of big O -->O(26) or O(1)
 */
public class Assignment2 {
    public static boolean check(String s) {
        boolean alphabets[] = new boolean[26];
        Arrays.fill(alphabets, false);
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
            alphabets[ch[i] - 'a'] = true;
        for (int i = 0; i < 26; i++)
            if (alphabets[i] == false)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a String: ");
            String input = sc.next();
            if (check(input))
                System.out.println("String has all characters");
            else
                System.out.println("String does not have all characters");
        }
    }
}
