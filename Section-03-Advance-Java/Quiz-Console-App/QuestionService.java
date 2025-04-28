import java.util.Scanner;

public class QuestionService {
    Question[] questions=new Question[5];
    String[] userAnswers=new String[questions.length];

    public QuestionService() {
        questions[0]=new Question(1,"size of boolean","1","2","4","8","1");
        questions[1]=new Question(2,"size of char","1","2","4","8","2");
        questions[2]=new Question(3,"size of int","1","2","4","8","4");
        questions[3]=new Question(4,"size of float","1","2","4","8","4");
        questions[4]=new Question(5,"size of long","1","2","4","8","8");

    }

    public void displayQuestions() {
        int i=0;

        for (Question q: questions) {
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());

            Scanner sc=new Scanner(System.in);
            userAnswers[i]=sc.nextLine();
            i++;
        }
    }

    public void printScore() {
        int score=0;

        for (int i=0;i<questions.length;i++) {
            Question que=questions[i];
            String actualAns=que.getAnswer();
            String userAns=userAnswers[i];

            if (userAns.equals(actualAns))
                score++;
        }

        System.out.println("Your score is : "+score);
    }
}
