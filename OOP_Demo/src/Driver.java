import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Question question = new Question("Who was the inventor of Java? ", "James Gosling");


        ChoiceQuestion second = new ChoiceQuestion("What was the original name of the Java language? ");
        second.addChoice("*7", false);
        second.addChoice("Duke", false);
        second.addChoice("Oak", false);
        second.addChoice("Gosling", true);

        ChoiceQuestion third = new ChoiceQuestion("In which country was the inventor of Java born? ");
        third.addChoice("Australia", false);
        third.addChoice("Canada", true);
        third.addChoice("Denmark", false);
        third.addChoice("United States", false);

        presentQuestion(question);
        presentQuestion(second);
        presentQuestion(third);

    }

    public static void presentQuestion(Question q) {
        q.display();
        Scanner scan = new Scanner(System.in);
        System.out.println("Your answer: ");
        String response = scan.nextLine();
        System.out.println(q.checkAnswer(response) ? "You are correct!" : "You are not correct. The answer is "
                + q.getAnswer() );

    }
}
