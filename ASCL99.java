package mp1;
import java.util.Scanner;

public class ASCL99{
	public static void main(String[] args) {
		int points;
		int finalpoints = 0;
		String turn = "player";
		String finalturn = "";
		int[] cards = new int[3];
		
		Scanner init = new Scanner(System.in);
		points = init.nextInt();
		
		Scanner card1 = new Scanner(System.in);
		Scanner card2 = new Scanner(System.in);
		Scanner card3 = new Scanner(System.in);
		
		cards[0] = cardfacevalue(card1.next());
		cards[1] = cardfacevalue(card2.next());
		cards[2] = cardfacevalue(card3.next());
		
		points += cardtonum(greatest(cards), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		Scanner card4 = new Scanner(System.in);
		picknew(card4.next(), cards, points);
		
		Scanner card5 = new Scanner(System.in);
		points += cardtonum(cardfacevalue(card5.next()), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		points += cardtonum(greatest(cards), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		Scanner card6 = new Scanner(System.in);
		picknew(card6.next(), cards, points);
		
		Scanner card7 = new Scanner(System.in);
		points += cardtonum(cardfacevalue(card7.next()), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		points += cardtonum(greatest(cards), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		Scanner card8 = new Scanner(System.in);
		picknew(card8.next(), cards, points);
		
		Scanner card9 = new Scanner(System.in);
		points += cardtonum(cardfacevalue(card9.next()), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		points += cardtonum(greatest(cards), points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		Scanner card10 = new Scanner(System.in);
		picknew(card10.next(), cards, points);
		
		finalpoints = pointscheck(points, finalpoints);
		changeturn(turn);
		finalturn = checkturn(turn, finalpoints);
		
		System.out.println(finalpoints + ", " + finalturn);
	}
	// ----------------------------------------------------------
	public static int cardtonum(int c, int points) {
		if (c == 10) {
			return -10;
		} else if (c == 14) {
			if (points < 86) {
			return 14;
			} else {
			return 1;
			}
		} else if (c == 9) {
			return 0;
		} else {
			return c;
		}
	}
	// ----------------------------------------------------------
	public static int cardfacevalue(String c) {
		if (c.equals("T")) {
			return 10;
		} else if (c.equals("J")) {
			return 11;
		} else if (c.equals("Q")) {
			return 12;
		} else if (c.equals("K")) {
			return 13;
		} else if (c.equals("A")) {
			return 14;
		} else {
			return Integer.parseInt(c);
		}
	}
	// ----------------------------------------------------------
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
	// ----------------------------------------------------------
	public static void picknew(String pick, int cards[], int points) {
		if (cards[0] == -100) {
			cards[0] = cardfacevalue(pick);
		} else if (cards[1] == -100) {
			cards[1] = cardfacevalue(pick);
		} else {
			cards[2] = cardfacevalue(pick);
		}
	}
	// ----------------------------------------------------------
	public static String changeturn(String turn) {
		if (turn.equals("player")) {
			return "dealer";
		} else {
			return "player";
		}
	}
	//------------------------------------------------------------
	public static String checkturn(String turn, int finalpoints) {
		if (turn.equals("player") && finalpoints > 0) {
			return "player";
		} else if (turn.equals("dealer") && finalpoints > 0) {
			return "dealer";
		} else {
			return "never returned";
		}
	}
	//------------------------------------------------------------
	public static int pointscheck(int points, int finalpoints) {
		if (finalpoints < 99) {
			if (points > 99) {
				return points;
			} else {
				return finalpoints;
			}
		} else {
			return finalpoints;
		}
	}
}
