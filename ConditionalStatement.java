package basic_Java;
import java.util.Scanner;
public class ConditionalStatement {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a>5) {
			if(a>10) {
				System.out.println(" number is greater than 10 ");
				}
			else if(a>8) {
				System.out.println(" number is greater than 8 but less than 10 ");
			}
			else {
				System.out.println(" number is greater than 5 but less than 8 ");
				}
		}
		else if(a<5){
			System.out.println("Smaller than 5 ");
			}
	
		else {
			System.out.println(" number is 5 ");
		}

	}

}
