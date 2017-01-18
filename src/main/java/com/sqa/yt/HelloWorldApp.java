/**
 * File Name: HelloWorldApp.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 14, 2017
 */
package com.sqa.yt;

/**
 * HelloWorldApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class HelloWorldApp {

	public static void main(String[] args) {
		String appName = "Hello World";
		String userName = AppBasics.greetUserAndGetName(appName);
		doSomething();
		AppBasics.farewellUser(userName, appName);
	}

	private static void doSomething() {
		System.out.println("Application is doing it's thing...");
	}
}
