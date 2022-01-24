import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double[] numbers = new double[3];
        double ans = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextDouble();
            ans += numbers[i]/3;
        }
        System.out.println("The average of " + print(numbers) + "is " + ans);

        input.close();
    }

    static String print(double[] array){
        String str1 = "";
        for (int i = 0; i < array.length; i++) {
            str1 += array[i] + " ";
        }
        return str1;
    }
}

