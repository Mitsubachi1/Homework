import java.util.Scanner;

public class QuestionDemo
{
   public static void main(String[] args)
   {
      Question[] quiz = new Question[2];

      quiz[0] = new Question();
      quiz[0].addLine("Who was the inventor of Java?");
      quiz[0].setAnswer("James Gosling");      

      ChoiceQuestion question = new ChoiceQuestion(
         "In which country was the inventor of Java born?");
      question.addChoice("Australia", false);
      question.addChoice("Canada", true);
      question.addChoice("Denmark", false);
      question.addChoice("United States", false);
      quiz[1] = question;

      Scanner in = new Scanner(System.in);
      for (Question q : quiz)
      {
         q.display();
         System.out.println("Your answer: ");
         String response = in.nextLine();
         System.out.println(q.checkAnswer(response));      
      }
   }
}

/**
   A question with a text and an answer.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty text and empty answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Add a line of text to the question text.
   */
   public void addLine(String line)
   {
      text = text + line + "\n";
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.print(text);
   }


   /**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   // Add any needed instance variables, but don't store the choices
   // The choices should be added to the text of the superclass
   /* Your code goes here */
   private String text;
   private String answer;
   
   /**
      Constructs a choice question with a given text and no choices.
      @param questionText the text of this question
   */
   public ChoiceQuestion(String questionText)
   {
      super();
      text = questionText;
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      /* Your code goes here */
   }

}

