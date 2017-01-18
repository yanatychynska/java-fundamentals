/**
 * File Name: FundamentalsApp.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.yt;

public class FundamentalsApp {

	public static void main(String[] args) {
		String appName = "Java Fundamentals";
		String userName = AppBasics.greetUserAndGetName(appName);
		compareNumberTo10();
		checkUserMonth();
		checkUserGrade();
		AppBasics.farewellUser(userName, appName);
	}

	private static void checkUserGrade() {
		String input = AppBasics.requestInfoFromUser("Give me a grade number");
		int grade = Integer.parseInt(input);
		if (grade >= 90 && grade <= 100) {
			System.out.println("Grade is A");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("Grade is B");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("Grade is C");
		} else {
			System.out.println(" Grade is F");
		}
	}

	private static void checkUserMonth() {
		String input = AppBasics.requestInfoFromUser("Give me a month:");
		int userMonth = Integer.parseInt(input);
		switch (userMonth) {
		case 1:
			System.out.println("YOu have chosen the month of January");
			break;
		case 2:
			System.out.println("You have chosen the month of February");
			break;
		case 3:
			System.out.println("You have chosen the month of March");
			break;
		case 4:
			System.out.println("You have chosen the month of Aril");
			break;
		case 5:
			System.out.println("You have chosen the month of May");
			break;
		case 6:
			System.out.println("You have chosen the month of June");
			break;
		case 7:
			System.out.println("You have chosen the month of July");
			break;
		case 8:
			System.out.println("You have chosen the month of August");
			break;
		case 9:
			System.out.println("You have chosen the month of September");
			break;
		case 10:
			System.out.println("You have chosen the month of October");
			break;
		case 11:
			System.out.println("You have chosen the month of November");
			break;
		case 12:
			System.out.println("You have chosen the month of December");
			break;
		default:
			System.out.println("You have not chosen a valid month");
			break;
		}
	}

	private static void compareNumberTo10() {
		String input = AppBasics.requestInfoFromUser("Give me a number:");
		int userNumber = Integer.parseInt(input);
		if (userNumber > 10) {
			System.out.println("Number is greater than 10");
		} else if (userNumber < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("Number is 10!");
		}
	}
}
