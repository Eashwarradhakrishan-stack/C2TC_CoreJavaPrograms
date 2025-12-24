package tns_userdefinedinput;

import java.util.Scanner;

public class username {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter yor name:");
		String n = input.nextLine();
		System.out.println("Hello " +n);

	}

}
