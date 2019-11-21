package strong_pass;

import java.util.Scanner;

/**
 *
 * @author Joniyed
 */
public class Strong_pass {

    /**
     * @param args the command line arguments
     */
    
    static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		sc.nextInt();

		String password = sc.next();

		System.out.println(solve(password));



		sc.close();

	}
        static int solve(String password) {

		int addNum = 0;

		if (!password.chars().anyMatch(Character::isDigit)) {

			addNum++;

		}

		if (!password.chars().anyMatch(Character::isLowerCase)) {

			addNum++;

		}

		if (!password.chars().anyMatch(Character::isUpperCase)) {

			addNum++;

		}

		if (!password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf((char) ch) >= 0)) {

			addNum++;

		}

		addNum = Math.max(addNum, 6 - password.length());



		return addNum;

	}
        
    
}
