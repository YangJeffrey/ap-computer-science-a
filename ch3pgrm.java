/* Jeffrey Yang - 4B
 * 9/6/2019
 * Chapter 3 programming problems
 */

import java.util.Scanner;

public class ch3pgrm {

    public static void main(String args[]) {
        System.out.println("positivenumcheck (3.13)                 1");
        System.out.println("sentinelnumcheck (3.14)                 2");
        System.out.println("odds1to99 (3.15)                        3");
        System.out.println("multiples3from300down (3.16)            4");
        System.out.println("storehighest (3.18)                     5");
        System.out.println("checkachar (3.19)                       6");
        System.out.println("strbackward (3.20)                      7");
        System.out.println("everyotherchar (3.21)                   8");
        Scanner obj = new Scanner(System.in);
        int select = obj.nextInt();
        if (select == 1) {
            positivenumcheck();
        } else if (select == 2) {
            sentinelnumcheck();
        } else if (select == 3) {
            odds1to99();
        } else if (select == 4) {
            multiples3from300down();
        } else if (select == 5) {
            storehighest();
        } else if (select == 6) {
            checkachar();
        } else if (select == 7) {
            strbackward();
        } else if (select == 8) {
            everyotherchar();
        }
    }

    /* gets a number and checks if it is positive; if not, gets another number (3.13) */
    static void positivenumcheck() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int num = obj.nextInt();
        while (num <= 0) {
            num = obj.nextInt();
        }
    }

    /* gets a number and checks it if is equal to SENTINEL; if not, gets another number (3.14) */
    static void sentinelnumcheck() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int num = obj.nextInt();
        final int SENTINEL = -99;
        while (num != SENTINEL) {
            num = obj.nextInt();
        }
    }

    /* prints all the oddnumbers from 1 to 99 (3.15) */
    static void odds1to99() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
            System.out.println(i);
        }
    }

    /* print multiples of 3 from 300 to 3 (3.16) */
    static void multiples3from300down() {
        for (int i = 300; i > 2; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    /* reads 10 integer value inputs and prints the highest value stored(3.18) */
    static void storehighest() {
        double high = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < 10; i++) {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter a number");
            int num = obj.nextInt();
            if (num > high) {
                high = num;
            }
        }
        System.out.println("highest number: " + high);
    }

    /* finds and prints the number of times the character a appears in string name (3.19) */
    static void checkachar() {
        String obj = "name";
        int count = 0;
        if (obj.indexOf('a') >= 0) {
            count++;
        }
        System.out.println("appearances of character a in " + obj + ": " + count);
    }

    /* prints characters stored backward (3.20) */
    static void strbackward() {
        String str = "hello world";
        System.out.println(str + " backwards: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }

    /* prints every other character in string (3.21) */
    static void everyotherchar() {
        String word = "hello world";
        System.out.println("every other character of " + word + ": ");
        for (int i = 0; i < word.length(); i+=2) {
            System.out.print(word.charAt(i));
        }
    }
}
