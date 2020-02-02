package russell_p01;

import java.util.Scanner;

public class Decrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum , secondnum, thirdnum, fourthnum, number, temp;
        Scanner input = new Scanner( System.in );
 
        {
        System.out.print("Enter your encrypted 4 digit number: ");
        number = input.nextInt();
        }
 
        // obtain digits of number
        firstnum = number / 1000;
        secondnum = number / 100 % 10;
        thirdnum = number / 10 % 10;
        fourthnum = number % 10;
     
        // Replace each digit with the result of adding 7 to the digit and getting
    	// the remainder after dividing the new value by 10. 
        firstnum = (firstnum + 3) % 10;
        secondnum = (secondnum + 3) % 10;
        thirdnum = (thirdnum + 3) % 10;
        fourthnum = (fourthnum + 3) % 10;
 
        //swap a-c and b-d 
        temp = firstnum;
        firstnum = thirdnum;
        thirdnum = temp;
 
        temp = secondnum;
        secondnum = fourthnum;
        fourthnum = temp;

        //generate result number 
        System.out.printf("The decrypted number is %d%d%d%d\n",
                firstnum, secondnum, thirdnum, fourthnum);
    }
}