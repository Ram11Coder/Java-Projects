

import java.util.Scanner;

public class FlamesMain {
	static {
		System.out.println("---------------------------------------------------------------");
		System.out.println("Hi Guys!!Let's play the childhood game (FLAMES)				");
		System.out.println("---------------------------------------------------------------");
	}

	public static void main(String[] args) {
		boolean flag = true;
		String userInput, name1, name2;
		Scanner sc = new Scanner(System.in);
		while (flag) {

			System.out.print("Enter your name :) ");

			name1 = sc.nextLine();

			System.out.print("Enter your partner name :) ");
			name2 = sc.nextLine();

			Users us = new Users(name1.replaceAll("\\s", ""), name2.replaceAll("\\s", ""));
			if (RelationShipCalculator.calculator(us.getYourName(), us.getPartnerName()) != 0) {
				us.setRelationStatus(RelationShipCalculator
						.relationshipCheck(RelationShipCalculator.calculator(us.getYourName(), us.getPartnerName())));

				System.out.println("Your's relationship  is - " + us.getRelationStatus());
			} else {
				System.out.println("We can't apply the FLAMES for above names!! Try something else ");
			}

			System.out.println("Do you want to play the game again?(Y/N)");

			userInput = sc.nextLine();

			if (userInput.charAt(0) == 'N' || userInput.charAt(0) == 'n' || userInput.equalsIgnoreCase("NO"))
				flag = false;
			else if (userInput.charAt(0) == 'Y' || userInput.charAt(0) == 'y' || userInput.equalsIgnoreCase("YES"))
				flag = true;
			else {
				System.out.println("Sorry!! You enter the incorrect input");
				break;
			}
		}
		sc.close();
	}
}
