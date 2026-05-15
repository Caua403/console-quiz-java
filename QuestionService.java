
import java.util.Scanner;

public class QuestionService {
   Scanner sc = new Scanner(System.in); 
   Question[] questions = new Question[5];
   String selection [] = new String[questions.length];
    public QuestionService()
    {
        questions[0] = new Question(1, "Qual palavra-chave é usada para criar uma classe em Java?", "function", "define", "class", "new", "class");
        questions[1] = new Question(2, "Qual tipo de dado é usado para armazenar números inteiros em Java?", "float", "int", "String", "Boolean", "int");
        questions[2] = new Question(3, "Qual comando é usado para imprimir algo no console em Java?", "print.console()", "echo()", "System.out.println()", "Console.write()", "System.out.println()");
        questions[3] = new Question(4, "Qual símbolo é usado para finalizar uma instrução em Java?", ":", ",", ".", ";", ";");
        questions[4] = new Question(1,"Qual estrutura é usada para tomar decisões em Java?", "loop", "if", "print", "import", "if");
    }
   public void displayQuestions(){
    int i = 0;
    for(Question q : questions){
        System.out.println(q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        System.out.println("Your answer is: ");
        selection[i] = sc.nextLine();
        while(!selection[i].equals(q.getOpt1()) && (!selection[i].equals(q.getOpt2())) && (!selection[i].equals(q.getOpt3())) && (!selection[i].equals(q.getOpt4()))){
            System.out.println("Erro. Digite uma das 4 opções");
            selection[i] = sc.nextLine();
        }
        i++;
    }
    System.out.println("You answered:");
    for(String s : selection){
        System.out.println(s);
    }
    }

    public void userScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String userAnswer = selection[i];
            String actualAnswer = que.getAnswer();
            if(userAnswer.equals(actualAnswer)){
                score ++;
            }
            
        }
        System.out.println("Your score: " + score);
    }
   }

