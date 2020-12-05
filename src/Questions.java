import java.util.List;
import java.util.Random;

public class Questions {

    List<Question> questions = <"Τι χρώμα έχουν οι φράουλες?",
            "Πότε γιορτάζουμε την ελληνική επανάσταση?",
            "Ο Καραθεοδωρής ήταν" >;
    Random randomGenerator = new Random();
    int index = randomGenerator.nextInt(questions.size());
    Question question = questions.get(index);
}
