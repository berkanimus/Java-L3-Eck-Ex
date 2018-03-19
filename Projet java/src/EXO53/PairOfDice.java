package EXO53;

/**
 * An object of class PairOfDice represents a pair of dice,
 * where each die shows a number between 1 and 6.  The dice
 * can be rolled, which randomizes the numbers showing on the
 * dice.
 */
public class PairOfDice {

   private int die1;   // Number showing on the first die.
   private int die2;   // Number showing on the second die.

   /**
    * Constructor creates a pair of dice and rolls them so that
    * they initially show some random value.
    */
   public PairOfDice() {
       roll();  // Call the roll() method to roll the dice.
   }
   
   /**
    * Roll the dice by setting each die to be a random number between 1 and 6.
    */
   public void roll() {
       die1 = (int)(Math.random()*6) + 1;
       die2 = (int)(Math.random()*6) + 1;
   }
           
   /**
    * Return the number showing on the first die.
    */ 
   public int getDie1() {
      return die1;
   }
   
   /**
    * Set the value of the first die.  Throws an IllegalArgumentException
    * if the value is not in the range 1 to 6.
    */
   public void setDie1( int value ) {
      if ( value < 1 || value > 6 )
         throw new IllegalArgumentException("Illegal dice value " + value);
      die1 = value;
   }
   
   /**
    * Return the number showing on the second die.
    */ 
   public int getDie2() {
      return die2;
   }
   
   /**
    * Set the value of the second die.  Throws an IllegalArgumentException
    * if the value is not in the range 1 to 6.
    */
   public void setDie2( int value ) {
      if ( value < 1 || value > 6 )
         throw new IllegalArgumentException("Illegal dice value " + value);
      die2 = value;
   }
   
   /**
    * Return the total showing on the two dice.
    */ 
   public int getTotal() {
      return die1 + die2;
   }
   
   /**
    * Return a String representation of a pair of dice, where die1
    * and die2 are instance variables containing the numbers that are
    * showing on the two dice.
    */
   public String toString() {
      if (die1 == die2)
         return "double " + die1;
      else
         return die1 + " and " + die2;
   }
   
  // end class PairOfDice


 
/** 
 * Rolls a pair of dice until the dice come up snake eyes
 * (with a total value of 2).  Counts and reports the
 * number of rolls.
 */
   public static void main(String[] args) {
      
      PairOfDice dice;  // A variable that will refer to the dice.
      int rollCount;    // Number of times the dice have been rolled.

      dice = new PairOfDice();  // Create the PairOfDice object.
      rollCount = 0;
      
      /* Roll the dice until they come up snake eyes. */
      
      do {
          dice.roll();
          System.out.println("The dice come up " + dice );
          rollCount++;
      } while (dice.getTotal() != 2);
      
      /* Report the number of rolls. */
      
      System.out.println("\nIt took " + rollCount + " rolls to get a 2.");
      
      /* Now, generate an exception. */
       
      System.out.println();
      System.out.println("This program will now crash with an error");
      System.out.println("when it tries to set the value of a die to 42.");
      System.out.println();
      
      dice.setDie1(42);
      System.out.println(dice);  // This statement will not be executed!
      
   }
   
   }// end class RollFor2