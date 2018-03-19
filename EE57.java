/*
  The program is a graded  quiz, 10 question about arithmetic operations (addiction and subtraction) 
  and non-math questions. All the answers are integers
 */
import java.util.Scanner;
public class EE57 {

    // -------------------- Nested classes and interface -----------------------
    interface IntQuestion {
        public String getQuestion();
        public int    getCorrectAnswer();
       
    }
    static class AddQuestion implements IntQuestion {
       private int a,b;  // Numbers to add
      
       public AddQuestion() { // constructor
           a = (int)(Math.random() * 100 + 1);
           b = (int)(Math.random() * 100);
       }
       public String getQuestion() {
           return "How does " + a + " + " + b + " make ?";
       }
       public int getCorrectAnswer() {
           return a + b;
       }
   
   }

   
   static class SubtractQuestion implements IntQuestion {
       	private int a,b; // Numbers to subtract
          
        public 	SubtractQuestion() {  
           a = (int)(Math.random() * 100 + 1);
           b = (int)(Math.random() * 100);
       }
       public String getQuestion() {
       	if (b > a) { // make sure to not have a negative result
                return "How does " + b + " - " + a + " make ? ";
          } else 
           return "How does " + a + " - " + b + " make ? ";
       }
       public int getCorrectAnswer() {
         	if (b > a) { 
              return b - a;
              } else return a - b;
            
       }
    }


    private static void createQuiz() {
        questions = new IntQuestion[10];

        for ( int i = 0; i < 4; i++ ) {
           	 questions[i] = new AddQuestion();
	    }
	     for ( int i = 4; i < 8; i++ ) {
             questions[i] = new SubtractQuestion();
	    }

        questions[8] = new IntQuestion() {
              public String getQuestion() {
                  return "When did Stephane Hawkins die ?";
              }
              public int getCorrectAnswer() {
                  return 2018;
              }
        };
        questions[9] = new IntQuestion() {
              public String getQuestion() {
                  return "How old was Emmanuel Macron when he has been elected president of France ?";
              }
              public int getCorrectAnswer() {
                  return 39;
              }
        };
      
   }        
    
    
    // function to ask the ten question and stock user's answer in an array called userAnswers
    private static int [] administerQuiz() {
    	Scanner sc = new Scanner(System.in);
        int [] userAnswers = new int[10]; // all user's answers
        for (int i = 0; i < 10; i++) {
            System.out.printf("Question number "+ i+1 +" :" +questions[i].getQuestion());
            userAnswers[i] = sc.nextInt();       
         }
         return userAnswers;
    }
    
    
    /**
     * calculate the score of user
     */
    private static void gradeQuiz() {
      
        System.out.println("Let's see how scord you got !");
        int nb = 0; // number user's correct answer 
        int grade;
        int [] userAnswers;
        userAnswers = administerQuiz ();
        for (int i = 0; i < 10; i++) {
            if ( userAnswers[i] == questions[i].getCorrectAnswer() ) {
                nb++;
            }
            
            System.out.println();
        }
        grade = nb * 10;
        System.out.println("You got " + nb + " correct answer.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }


    
    // -------------------- The Program --------------------------------------

    private static IntQuestion[] questions;  // array of given question

    private static int[] answers;   // array of user's answer.
    
    // main to test the program
    public static void main(String[] args) {
        System.out.println("Hello, welcome to our quiz, the question are easy so we expect from you a good grade");
        System.out.println("Be careful! every question expects an integer answer ");
        System.out.println();
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }

} 