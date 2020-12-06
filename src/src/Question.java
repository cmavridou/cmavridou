



/*Αυτή η κλάση κλάση αναπαριστά μία ερώτηση
* με 4 πιθανές απαντησεις
*εκ των οποίων η μία είναι η σωστή απάντηση.
 */

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    //Δημιουργία κατασκευαστή
    public Question(String question,String[] answers,int correctAnswer){
        this.question=question;
        this.answers=answers;
        this.correctAnswer=correctAnswer;
    }

    //Μεθοδος που αλλάζει την ερώτηση

    public void setQuestion(String question) {
        this.question = question;
    }

    //Μεθοδος που αλλάζει τις απαντήσεις

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    //Μεθοδος που αλλάζει την σωστή απάντηση


    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    //Μεθοδος που επιστρέφει την ερώτηση
    public String getQuestion() {
        return question;
    }

    //Μεθοδος που επιστρέφει τις απαντήσεις
    public String[] getAnswers() {
        return answers;
    }

    //Μεθοδος που επιστρέφει την σωστή απάντηση
    public int getCorrectAnswer() {
        return correctAnswer;
    }




}
