package obliczanieWieku;

import java.util.Scanner;

public class skaner {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int x;
		System.out.println("Podaj swoj rok urodzenia");
		x=sc.nextInt();
		System.out.println(("Masz ")+(2023-x)+(" lat"));
		System.out.println(("Bedziesz pelnoletni za ")+(18-(2023-x)+(" lat")));

	}

}

