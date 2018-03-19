package EXO53;


public class EE53 {

   private int NUMBER_OF_EXPERIMENTS = 10000;
   private  PairOfDice dice = new PairOfDice();
           
      // return number of attempt to get given number n 
      // : N > 1 
    public static int rollFor( int N ) {
        int occ = 0;  // Occurence made to get number N.
        while (dice.getTotal()!=N) {
          dice.roll();
          occ++;
        } 
        return occ;
   }
   
    // Do the experience rollFor NUMBER_OF_EXPERIMENTS times for each possible total of two dice
    public static void resultForEachTotal () {
       for ( int total = 2;  total <= 12;  total++ ) {
          StatCalc stats = new StatCalc(); // object variable to ge
          // Do the experience rollFor NUMBER_OF_EXPERIMENTS times 
          for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
              stats.enter( rollFor(total) );
          }
         System.out.printf("For the total ", total, "mean is ", stats.getMean(), "standar deviation is " stats.getStandardDeviation(), " and the largest item is" stats.getMax());    
   } 



   public static void main(String[] args) {
   
     private  PairOfDice test = new PairOfDice();
     test.resultForEachTotal(); // test the function 
   }  
}  
