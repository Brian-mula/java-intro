package javaintro;

import java.util.Date;
import java.util.Scanner;

public class MyModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=30;
		int herAge=age+1;
		System.out.println("Hello world");
		System.out.println(age);
		System.out.println(herAge);
		
		Date now=new Date();
		System.out.println(now);
		String message="Mulati Brian" + " !!";
		System.out.println(message.length());
		System.out.println(message.endsWith("!!"));

		// swap two variables
		int x=10;
		int y=20;

		System.out.println("x :"+ x);
		System.out.println("y :"+ y);

		int temp;
		temp=x;
		x=y;
		y=temp;

		System.out.println("x: "+ x);
		System.out.println("y: "+ y);

		// accepting user inputs

		Scanner scanner=new Scanner(System.in);

		System.out.println("What is your name buddy??");
		String name=scanner.nextLine();
		System.out.println("How old are you?");
		int ages=scanner.nextInt();
		System.out.println("Helloe "+ name + "and you are " + ages + "years old");


	}

}
