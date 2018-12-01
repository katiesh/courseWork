package course3;

public class Question {
    /** question which is asked */
    private String question;
    /** answer on question */
    private String answer;

    /**
     * @return this question{@link Question#question}
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Generate the object of class Question
     * Set the field question {@link Question#question}
     * @param question This is question which is asked
     */
    public Question(String question) {
        this.question = question;
    }

    /**
     * @return this answer{@link Question#question}
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Set the field answer {@link Question#answer}
     * @param answer This is answer on the question {@link Question#answer}
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
