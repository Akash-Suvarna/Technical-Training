import java.util.*;
public class Password {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Password");
		String password = sc.nextLine();
		int result = isValidPassword(password);

        if (result == 1) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

	}
	 public static int isValidPassword(String password) {
		
		 if (password.length() < 8) {
		        return 0;
		    }

		    if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*") || !password.matches(".*[@#$%^&+=].*")) {
		        return 0;
		    }

		    
		    if (password.contains(" ")) {
		        return 0;
		    }

		    
		    return 1;
			
		}
		 
	 }
	        
	        
	        
	        
	
	 


