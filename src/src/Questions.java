import java.util.ArrayList;
import java.util.Random;

public class Questions {

        private ArrayList<Question> questions;
        private Question randomQuestion;


        public Questions() {

            questions = new ArrayList<Question>();


        questions.add(new Question("In what movie does Robin Williams play the role of a divorced father posing as an elderly British nanny to spend more time with his children? ",
                new String[]{"Mr. Mom", "Toys", "Tootsie", "Mrs. Doubtfire"},4));
        questions.add(new Question("Which of the following metals is liquid at room temperature?",
                new String[]{"Mercury", "Magnesium", "Cobalt", "Potassium"},1));


            }

   /* public void RandomQuetion(){


            randomQuestion=new Question();

            Random randIndex = new Random();
            int numberOfQuestion = randIndex.nextInt(questions.size());
            randomQuestion = questions.get(numberOfQuestion);
            return randomQuestion;
        }
  */
}
