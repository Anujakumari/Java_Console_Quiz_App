package quizapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApp {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();
        int score = 0;

        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("1) int");
        options1.add("2) boolean");
        options1.add("3) char");
        options1.add("4) double");
        Question q1 = new Question("Which data type is used to store true or false values in Java?", options1, 2);
        questions.add(q1);

        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("1) extends");
        options2.add("2) implements");
        options2.add("3) inherits");
        options2.add("4) interface");
        Question q2 = new Question("\nWhich keyword is used to create a subclass in Java?", options2, 1);
        questions.add(q2);

        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("1) java.lang");
        options3.add("2) java.util");
        options3.add("3) java.io");
        options3.add("4) java.net");
        Question q3 = new Question("\nWhich package contains the Scanner class?", options3, 2);
        questions.add(q3);

        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("1) Sun Microsystems");
        options4.add("2) Oracle");
        options4.add("3) Microsoft");
        options4.add("4) Google");
        Question q4 = new Question("\nWho originally developed Java?",options4,1);
        questions.add(q4);

        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("1) Object-Oriented Programming");
        options5.add("2) Operating System");
        options5.add("3) Online Optimization Process");
        options5.add("4) Optional Operator Protocol");
        Question q5 = new Question("\nWhat does OOP stand for in Java?", options5,1);
        questions.add(q5);

        System.out.println("\n=====  Welcome to the Java Quiz!  =====\n");
        System.out.println("Please type the option number (1-4) and press Enter.\n");

        for (int i = 0; i < questions.size(); i++) 
        {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            int userAnswer = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("\nYour answer: ");
                
                if (scanner.hasNextInt()) 
                {
                    userAnswer = scanner.nextInt();
                    if (userAnswer >= 1 && userAnswer <= q.options.size()) 
                    {
                        validInput = true;
                    } 
                    else 
                    {
                        System.out.println("Please enter a number between 1 and " + q.options.size());
                    }
                    
                } 
                else 
                {
                    System.out.println("Invalid input. Enter a number.");
                    scanner.next(); // discard invalid input
                }
            }

            if (userAnswer == q.correctOption) {
                System.out.println("Correct!\n");
                score++;
            } 
            else 
            {
                System.out.println("Incorrect. The correct answer was option " + q.correctOption + ".\n");
            }
        }

        System.out.println("\n===== Quiz Completed! =====\n");
        System.out.println("Your Score: " + score + " out of " + questions.size());

        if (score == questions.size()) 
        {
            System.out.println("Excellent! You got all questions right!");
        } 
        else if (score >= questions.size() / 2) 
        {
            System.out.println("Good job! Keep practicing.");
        } 
        else 
        {
            System.out.println("Better luck next time.");
        }

        scanner.close();
    }
}
