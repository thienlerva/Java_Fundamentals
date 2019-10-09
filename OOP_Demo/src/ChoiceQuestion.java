import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question {

    private List<String> choices;

    public ChoiceQuestion(String question) {
        super(question, "");
        this.choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean answer) {
        choices.add(choice);
        if (answer) {
            super.setAnswer(String.valueOf(choices.size()));
        }
    }

    @Override
    public String getAnswer() {
        return choices.get(Integer.valueOf(super.getAnswer())-1);
    }

    @Override
    public void display() {
        super.display();
        // Display answer choices
        for (int i=0; i<choices.size();i++) {
            System.out.println(i+1 + ": " + choices.get(i));
        }
    }
}
