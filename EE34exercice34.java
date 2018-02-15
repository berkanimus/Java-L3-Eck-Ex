class exercice34 {
   
     int j=0; // increment variable to read the string
      public static void cut_String (String s) {
           for (int i=0; i<s.length(); i++) {
           	 if(!(Character.isletter(s.charAt(i)))) {
           	 	for (j;j<i;j++) {
           	 		System.out.print(s.charAt(j));
           	 	}
           	 	System.out.println();
           	 	j=i+1;

           	 }
           }
       }

        public static void main(String[] args){
        	string a = "let's test if this function is doing, well? ";
        	cut_String(a);

           }

}