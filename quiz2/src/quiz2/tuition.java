package quiz2;

import java.util.Scanner;

public class tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Initial Tuition Cost: ");
		int tuition = input.nextInt();
		System.out.print("Percentage increase: ");
		double perInc = input.nextDouble();
		int total = tuition;
		for(int i=0;i<4;i++){
			total+=(perInc/100*total);
		}
		System.out.println(total);
	}
}
