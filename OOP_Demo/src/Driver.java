import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Question question = new Question("Who was the inventor of Java? ", "James Gosling");

        question.display();

        Scanner scan = new Scanner(System.in);
        System.out.println("Your answer: ");
        String response = scan.nextLine();
        System.out.println(question.checkAnswer(response) ? "You are correct!" : "You are not correct");

    }
}
