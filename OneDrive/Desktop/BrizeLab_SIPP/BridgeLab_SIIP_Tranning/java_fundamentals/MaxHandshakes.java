import java.util.Scanner;
public class MaxHandshakes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.print("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes );
    }
}
