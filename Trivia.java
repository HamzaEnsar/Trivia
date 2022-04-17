import java.util.Locale;
import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = new String[5];
        questions[0] = "Donald Trump is the president of USA Y/N ";
        questions[1] = "Warsaw is the capital of Poland Y/N";
        questions[2] = "Turkey is located in South Asia Y/N ";
        questions[3] = "Lewandowski is a german footballer Y/N ";
        questions[4] = "This is Trivia game Y/N ";
        String[] answers = new String[5];
        answers[0] = "N";
        answers[1] = "Y";
        answers[2] = "N";
        answers[3] = "N";
        answers[4] = "Y";
        while (true) {
            System.out.println("Do you want to play trivia? ");
            if (input.next().toLowerCase(Locale.ROOT).equals("yes")) {
                introduce(questions, answers);
                System.out.println("---------");
                for(int y =3;y>0;y--)
                    System.out.println(y);
                TheGame(questions, answers);
            }

        }

    }


    public static void introduce(String[] questions, String[] answers) {
        System.out.println("Those are the questions get ready ");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

        }
    }

    public static void TheGame(String[] questions, String[] answers) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            if (input.next().equals(answers[i])) {
                System.out.println("Doing all right");
                counter = counter + 1;
                System.out.println("You have " +counter+ " points");
            } else {
                System.out.println("Not true man!!");
            }


        }


    }
}



