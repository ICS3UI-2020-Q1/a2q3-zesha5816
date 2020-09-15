import java.util.Scanner;
/**
 * determine the correct order for 2 numbers. For this program, a user will enter in 2 integers, a and b, and you will output them in ascending order.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
		Scanner input = new Scanner(System.in);
		//prompts user for 1st integer
		System.out.println("Please enter an integer:");
		int num1 = input.nextInt();
		//prompts user for 2nd integer
		System.out.println("Please enter another integer:");
		int num2 = input.nextInt();
		//if the first number is bigger than the 2nd no it will rite it as in the ascending order
		if (num1 > num2){
			System.out.println("Your number in ascending order are " + num2 + "," + num1);
		}
		else {
			System.out.println("Your number in ascending order are " + num1 + ", " + num2);
		}
    
  }
}
