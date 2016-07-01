import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do{
			System.out.println("Please enter a number(0 to exit): ");
			num = sc.nextInt();
			sum = sum + num;
		}
		while(num!=0);{
			System.out.println("The sum of all numbers is: "+ sum);
		}
		
	}

}
