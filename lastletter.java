import java.util.Scanner;

public class lastletter {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        boolean hasletters = false;
        char last = '*';
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                hasletters = true;
                last = str.charAt(i);
            }
        }
        System.out.println(last);
    }
}
