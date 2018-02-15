class exercice36 {
	int  [][] T = new int [1000][1]; // array with integers and thier total divisor  
	int c=0; // max_number_divisor
	int[] Result = new int []; 
	int k=0; // increment variable to Result 

	  public static int[] max_Divisor() {

	  	for (int i=0; i<1000;i++){
	  		T[i]=i+1; T[i][0]=0; //
	  		for(j=2;j<sqrt(i);j++) {
	  			if(i%j==0) {
	  				T[i][0]++;
	  			}
	  			T[i][0]*=2;
	  			}
	  			if(T[i][0]>c){
	  			   Result[K]=T[i];
	  			   c=T[i][0];
	  			}
	  			if(T[i][0]=c){
	  				Resultat[k+1]=T[i];

	  			}

	  		}
	  		Resultat[Resultat.length()]=c
	  		Return Resultat;

	  	}

	  	  public static void main (String [] args) {
	  	   int [] Answer= max_Divisor();
	  	   Strin s ="";
	  	   for(int i=0; i<Answer.length()-1;i++)
	  	     s+=(Answer[i]);

	  	  	System.out.println("Among integers between 1 and 1000,\n The maximun number of divivsor is"+Resultat[Resultat.length()-1]+"\n Numbers with that many divisors include "+)
	  	  } 
	   
}