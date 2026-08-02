

package Easy;

public class P0058_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int length = 0;
        int i = s.length() - 1;

        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

       
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

   
    public static void main(String[] args) {
        P0058_LengthOfLastWord solution = new P0058_LengthOfLastWord();

        // Test Cases
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";

        System.out.println("Test 1 Result: " + solution.lengthOfLastWord(test1) + " (Expected: 5)");
        System.out.println("Test 2 Result: " + solution.lengthOfLastWord(test2) + " (Expected: 4)");
        System.out.println("Test 3 Result: " + solution.lengthOfLastWord(test3) + " (Expected: 6)");
    }
}
