package com.costaff;

public class Answers {
    private String answer;

    public Answers(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
