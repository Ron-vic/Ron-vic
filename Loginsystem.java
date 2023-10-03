import java.util.Scanner;

public class LoginSystem
{
    public  static void main(String [] args)
    {
       String correctUsername = "Victor";
       String correctPassword = "Kiprotich123";
       int attempts = 3; 
       Scanner Log = new Scanner(System.in);
       while (attempts > 0)
       {
                System.out.print("Enter username: ");
                String username = Log.nextLine();
                System.out.print("Enter password: ");
                String password = Log.nextLine();
               
                
                System.out.print("User Password: ");
                for (int i = 0; i < password.length(); i++)
                {
                    System.out.print("*");
                }
                System.out.println();
                
                
                 if (username.equals(correctUsername) && password.equals(correctPassword))
                 {
                System.out.println("Login successful!");
                break;
                 }
                 else
                 {    
                attempts--;

                if (attempts > 0) {
                    System.out.println("Remaining attempts: " + attempts);
                } else {
                    System.out.println("No more attempts. Account locked.");
                }
            }
        }

    }
}   

