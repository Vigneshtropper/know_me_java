package basic_Java;
import java.util.Scanner;// import scanner class

public class input {
	/*******taking input***/
    public static void main(String[]args )  {
	Scanner sc = new Scanner (System.in);// creating object of Scanner class
	
	// byte input 
	Byte b = sc.nextByte();
	
	//integer input 
	int a = sc.nextInt();
	
	//char input
	//char c = sc.();
	
	// string "word" input
	String s = sc.next();
	
	// whole sentence input
	String sent = sc.nextLine();
	
	// boolean input take only true : false  
	Boolean bl  = sc.nextBoolean();
	
	//float input 
	float f = sc.nextFloat();
	
	float fl = 5.325f;// madatary to apply f after number  
	
	// double input
	double d =sc.nextDouble();
	
	//long input 
	Long l = sc.nextLong();
	 
  }
}
