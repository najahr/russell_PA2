package russell_p01;

import java.util.Scanner;

/*A company that wants to send data over the Internet has asked you to write a program that 
 * will encrypt it so that it may be transmitted more securely. All the data is transmitted 
 * as four-digit integers. Your application should read a four-digit integer entered by the 
 * user and encrypt it as follows: Replace each digit with the result of adding 7 to the digit 
 * and getting the remainder after dividing the new value by 10. Then swap the first digit with
 *  the third, and swap the second digit with the fourth. Then print the encrypted integer. 
 *  Your application should also allow the user to enter an encrypted four-digit integer 
 *  and then decrypt it (by reversing the encryption scheme) to form the original number.
 */
public class Encrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum , secondnum, thirdnum, fourthnum, number, temp;
        Scanner input = new Scanner( System.in );
 
        do{
        System.out.print("Enter your 4 digit number: ");
        number = input.nextInt();
        }while(number / 1000 == 0 || number / 10000 != 0 );
 
        // obtain digits of number
        firstnum = number / 1000;
        secondnum = number / 100 % 10;
        thirdnum = number / 10 % 10;
        fourthnum = number % 10;
     
        // Replace each digit with the result of adding 7 to the digit and getting
    	// the remainder after dividing the new value by 10. 
        firstnum = (firstnum + 7) % 10;
        secondnum = (secondnum + 7) % 10;
        thirdnum = (thirdnum + 7) % 10;
        fourthnum = (fourthnum + 7) % 10;
 
        //swap a-c and b-d 
        temp = firstnum;
        firstnum = thirdnum;
        thirdnum = temp;
 
        temp = secondnum;
        secondnum = fourthnum;
        fourthnum = temp;

        //generate result number 
        System.out.printf("The encrypted number is %d%d%d%d\n",
                firstnum, secondnum, thirdnum, fourthnum);
    }
}