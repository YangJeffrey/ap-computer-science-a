package mp1;
import java.util.Scanner;

public class ASCL99 {
	public static void main(String[] args) {
		int points;
		int finalscore = 0;
		String turn = "player";
		int[] cards = new int[3];
		
		Scanner init = new Scanner(System.in);
		points = init.nextInt();
		
		Scanner card1 = new Scanner(System.in);
		Scanner card2 = new Scanner(System.in);
		Scanner card3 = new Scanner(System.in);
		
		cards[0] = cardtonum(card1.next(), points);
		cards[1] = cardtonum(card2.next(), points);
		cards[2] = cardtonum(card3.next(), points);
		
		points += greatest(cards);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		Scanner card4 = new Scanner(System.in);
		picknew(card4.next(), cards, points);
		
		Scanner card5 = new Scanner(System.in);
		points += cardtonum(card5.next(), points);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		points += greatest(cards);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		Scanner card6 = new Scanner(System.in);
		picknew(card6.next(), cards, points);
		
		Scanner card7 = new Scanner(System.in);
		points += cardtonum(card7.next(), points);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		points += greatest(cards);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		Scanner card8 = new Scanner(System.in);
		picknew(card6.next(), cards, points);
		
		Scanner card9 = new Scanner(System.in);
		points += cardtonum(card7.next(), points);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		points += greatest(cards);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		Scanner card10 = new Scanner(System.in);
		picknew(card10.next(), cards, points);
		
		turn = changeturn(turn);
		finalscore = scorecheck(points, finalscore);
		
		System.out.println(finalscore + ", " + turn);
		
	}
	public static int cardtonum(String c, int points) {
		if (c.equals("T")) {
			return -10;
		} else if (c.equals("J")) {
			return 11;
		} else if (c.equals("Q")) {
			return 12;
		} else if (c.equals("K")) {
			return 13;
		} else if (c.equals("A")) {
			if (points < 86) {
			return 14;
			} else {
			return 1;
			}
		} else if (c.equals("9")) {
			return 0;
		} else {
			return Integer.parseInt(c);
		}
	}
	public static int greatest(int cards[]) {
		int tempcard;
		if (cards[0] > cards[1] && cards[0] > cards[2]) {
			tempcard = cards[0];
			cards[0] = -100;
			return tempcard;
		} else if (cards[1] > cards[0] && cards[1] > cards[2]) {
			tempcard = cards[1];
			cards[1] = -100;
			return tempcard;
		} else {
			tempcard = cards[2];
			cards[2] = -100;
			return tempcard;
		}
	}
	public static void picknew(String pick, int cards[], int points) {
		if (cards[0] == -100) {
			cards[0] = cardtonum(pick, points);
		} else if (cards[1] == -100) {
			cards[1] = cardtonum(pick, points);
		} else {
			cards[2] = cardtonum(pick, points);
		}
	}
	public static String changeturn(String turn) {
		if (turn.equals("player")) {
			return "dealer";
		} else {
			return "player";
		}
	}
	public static int scorecheck(int points, int finalscore) {
		if (finalscore < 99) {
			if (points > 99) {
				return points;
			} else {
				return finalscore;
			}
		} else {
			return finalscore;
		}
	}
}
