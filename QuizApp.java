import java.util.Scanner;

public class  QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions 
        String[] questions = {
            "1. What is the full form of JVM?",
            "2. What is the index of the last element in an array of size n?",
            "3. Which of the following is the correct way to declare an array in Java?",
            "4. Which loop is guaranteed to run at least once?",
            "5. What does OOP stand for?"
        };
        // Options 

        String[][] options = {
            {"A. Java Very Machine", "B. Java Virtual Machine", "C. Just Virtual Machine", "D. Java Variable Mode"},
            {"A. n", "B. n-1", "C. n+1", "D. n/2"},
            {"A. int arr[] = new int(5);", "B. int arr[] =   int[5];", "C. int arr[] = new int[5];", "D. int arr() = new int[5];"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. Object Oriented Program", "B. Object Oriented Programming", "C. Operational Oriented Programming", "D. Ordinary Object Programming"}
        };
        //Answers

        char[] answers = {'B', 'B', 'C', 'C', 'B'};

        int score = 0;

        // Quiz Loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }

        // Final Result
        System.out.println("Quiz Finished!");
        System.out.println("Your total score is : " + score + "/" + questions.length);

        sc.close();
    }
}
