package course3;

/**
 * Admin can block users, respond on questions from users, create articles and
 * @author Kate Shkulova
 * @version 1.0
 * @since 1.12.2018
 */
public class Admin {
    /**admin's email adress*/
    private String email;
    /** admin's name*/
    private String name;
    /**password to authorize*/
    private String password;

    /**
     * Initialize fields {@link Admin#email}, {@link Admin#name},{@link Admin#password}
     * @see Admin
     * @param email
     * @param name
     * @param password
     */
    public Admin(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    /**
     * Change user's state{@link course3.users.personalCabinets.PersonalCabinet#state} to block or unblock user
     * @param state This is the current state of user
     * @see course3.users.personalCabinets.PersonalCabinet
     */
    private void changeState(boolean state){
        if(state){
            state = false;
        } else{
            state = true;
        }
    }

    /**
     * Set answer{@link Question#answer} on question {@link Question#question}
     * @param question This is the question on what will be respont
     * @param answer This is the answer on asked question
     * @see Question
     */
    public void respondQuestion(Question question, String answer){
        question.setAnswer(answer);
    }

    /**
     * Create the comment {@link Comment}by admin
     * @param comment This is the comment which will be created
     * @see Comment
     */
    private void createComment(Comment comment){
//        hm...
    }
}
