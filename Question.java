package quizapp;

import java.util.List;

public class Question {
	
	public String questionText;
    public List<String> options;
    public int correctOption;

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

}
