import java.util.Scanner;
public class Input
{
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Enter your weight in pound: ");
        double userWeight = scanner.nextDouble();

        System.out.print("Are you a smoker? true/false: ");
        boolean userDecision = scanner.nextBoolean();

        System.out.println();
        System.out.println("Your name is: " + userName);
        System.out.println("Your age is: " + userAge);
        System.out.println("Your weight is: " + userWeight);
        System.out.println("Smoker: " + userDecision);

        scanner.close();
    }
}
