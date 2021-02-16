package conditionalstatement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type weather status");
		boolean isRainToday = sc.nextBoolean();
		if(isRainToday) {
			System.out.println("I will take umbrealla with me");
		}else {
			System.out.println("I will not take umbrealla with me");
		}

	}

}
