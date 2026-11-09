import java.util.Scanner;

public class Magic8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, would you like to tell your fortune?: ");
        String answer = scanner.nextLine();

        if (answer.equals("yes")||answer.equals("YES")||answer.equals("Yes")||answer.equals("sure")||answer.equals("Sure"))
        {
            System.out.println("What is your question?");
            String question = scanner.nextLine();

            int rand = (int) (Math.random()* 8 + 1);
            System.out.println("Here is your answer: ");
            System.out.print(question+ ": ");

            if (rand == 1)
            {
                System.out.println("You will have horrible luck...");
            }
            else if (rand == 2)
            {
                System.out.println("Everything will go right for you..");
            }
            else if (rand == 3)
            {
                System.out.println("no");
            }
            else if (rand == 4)
            {
                System.out.println("Don't take it forgranted or something out of hand will happen.");
            }
            else if (rand == 5)
            {
                System.out.println("yes");
            }
            else if (rand == 6)
            {
                System.out.println("You will fail...");
            }
            else if (rand == 7)
            {
                System.out.println("You will pass!");
            }
            else
            {
                System.out.println("Magic 8 Ball..");
                System.out.println("loser.");
            }
        }
        else
        {
            System.out.println("Ok, goodbye!");
        }
        scanner.close();
    }
}