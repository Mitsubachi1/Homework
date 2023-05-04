/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   // Add any needed instance variables, but don't store the choices
   // The choices should be added to the text of the superclass
   /* Your code goes here */
   private String text;

   private int count;
   
   /**
      Constructs a choice question with a given text and no choices.
      @param questionText the text of this question
   */
   public ChoiceQuestion(String questionText)
   {
      super(); // create constructor
      text = questionText;
      super.addLine(text); // call question class do add question on line
      count = 1; //count because you gonna have to format
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      String numbering = Integer.toString(count) + ": "; //format
      if(correct){
         super.setAnswer((Integer.toString(count))); //calls setAnswer from QuestionClass
         }
      super.addLine(numbering + choice); //text
      count++; //numbering format

   }

}

