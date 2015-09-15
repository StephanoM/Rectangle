
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner (System.in);
		double Height;
		double Width;
		
		System.out.println("Enter the Height of the desired triangle:");
		Height = keyboard.nextDouble();
		
		System.out.println("Enter the Width of the desired triangle:");
		Width = keyboard.nextDouble();
		
		System.out.println("The permiter of the triangle is: " + (2*(Height*Width)) ) ;
		System.out.println("The permiter of the triangle is: " + (Height*Width) ) ;
	}

}
