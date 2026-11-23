import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. BMI calculator
        System.out.println("Enter your weight : ");
        double weight = input.nextDouble();
        System.out.println("Enter your height :");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("your BMI is :" + BMI);

        // 2. Percentage calculator
        System.out.print("Enter obtained marks: ");
        double obtained = input.nextDouble();
        System.out.print("Enter total marks: ");
        double total = input.nextDouble();
        double percentage = (obtained / total) * 100;
        System.out.println("Percentage = " + percentage + "%\n");

        // 3. Currency converter
        System.out.print("Enter amount in USD: ");
        double usd = input.nextDouble();
        System.out.print("Enter exchange rate (USD to EUR): ");
        double rate = input.nextDouble();
        double eur = usd * rate;
        System.out.println("Amount in EUR = " + eur + "\n");
      input.nextLine() ;

        // 4. String length and reverse
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Length of the string: " + text.length());
        System.out.println("Reversed string: \"" + reversed + "\"\n");

        // 5. Substring extraction
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter start index: ");
        int start = input.nextInt();
        System.out.print("Enter end index: ");
        int end = input.nextInt();
        String extracted = sentence.substring(start, end).trim();
        System.out.println("Extracted substring: \"" + extracted + "\"");

    }
}
