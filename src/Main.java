import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. BMI calculator
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f%n%n", bmi);

        // 2. Percentage calculator
        System.out.print("Enter obtained marks: ");
        double obtained = scanner.nextDouble();
        System.out.print("Enter total marks: ");
        double total = scanner.nextDouble();
        double percentage = (obtained / total) * 100;
        System.out.println("Percentage = " + percentage + "%\n");

        // 3. Currency converter
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        System.out.print("Enter exchange rate (USD to EUR): ");
        double rate = scanner.nextDouble();
        double eur = usd * rate;
        System.out.println("Amount in EUR = " + eur + "\n");
        scanner.nextLine(); // consume leftover newline before reading full lines

        // 4. String length and reverse
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Length of the string: " + text.length());
        System.out.println("Reversed string: \"" + reversed + "\"\n");

        // 5. Substring extraction
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String extracted = sentence.substring(start, end).trim();
        System.out.println("Extracted substring: \"" + extracted + "\"");

        scanner.close();
    }
}
