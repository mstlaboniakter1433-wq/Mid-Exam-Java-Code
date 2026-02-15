import java.util.Scanner;

public class GreadingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the marks = ");
		marks = scanner.nextInt();
		if(marks>=80 && marks<=100)
			System.out.print("The Gread is A+");
		else if(marks>=75 && marks<=79 )
			System.out.print("The Gread is A");
		else if(marks>=70 && marks<=74)
			System.out.print("The Gread is A-");
		else if(marks>=65 && marks<=69)
			System.out.print("The Gread is B+");
		else if(marks>=60 && marks<=64)
			System.out.print("The Gread is B");
		else if(marks>=50 && marks<=59)
			System.out.print("The Gread is C");
		else if(marks>=40 && marks<=49)
			System.out.print("The Gread is D");
		else if(marks>=0 && marks<=40)
			System.out.print("The Gread is F");
		else
			System.out.print("Enter a valid marks within 0-100 ");
			
		
		

	}	

}
