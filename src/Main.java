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
        input.nextLine();

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
        input.nextLine();
                // Q6: Check if a keyword is present in a sentence
                System.out.print("Enter a sentence: ");
                String sentence6 = input.nextLine();
                System.out.print("Enter a keyword: ");
                String keyword = input.nextLine();
                boolean isPresent = sentence6.contains(keyword);
                System.out.println("Is keyword \"" + keyword + "\" present in the sentence? " + isPresent);

                // Q7: Replace a word in a sentence with another word
                System.out.print("Enter a sentence: ");
                String sentence2 = input.nextLine();
                System.out.print("Enter the word to replace: ");
                String oldWord = input.nextLine();
                System.out.print("Enter the replacement word: ");
                String newWord = input.nextLine();
                String modified = sentence2.replace(oldWord, newWord);
                System.out.println(modified);

                // Q8: Check if two strings are equal (ignoring case)
                System.out.print("Enter string 1: ");
                String str1 = input.nextLine();
                System.out.print("Enter string 2: ");
                String str2 = input.nextLine();
                boolean isEqual = str1.equalsIgnoreCase(str2);
                System.out.println("Are strings equal (ignoring case)? " + isEqual);

            }
        }

