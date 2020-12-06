import java.util.ArrayList;
import java.util.Random;

    public class Questions {

        /*List<Question> questions = <"Τι χρώμα έχουν οι φράουλες?",
                "Πότε γιορτάζουμε την ελληνική επανάσταση?",
                "Ο Καραθεοδωρής ήταν" >;

         */
        private ArrayList<Question> questions;

        public Questions() {
            questions = <new Question("In what movie does Robin Williams play the role of a divorced father posing as an elderly British nanny to spend more time with his children? ",
                             new String[]={"Mr. Mom", "Toys", "Tootsie", "Mrs. Doubtfire"},4),
                        new Question("Which of the following metals is liquid at room temperature?",
                             new String[]={"Mercury","Magnesium","Cobalt","Potassium",1)>;

        }
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(questions.size());
        Question question = questions.get(index);
    }
}
