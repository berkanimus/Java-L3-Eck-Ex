public class exercice34 {
   

      public static void cut_String (String s) {
           for (int i=0; i<s.length(); i++) {
           	 if((Character.isLetter(s.charAt(i)))) {
           	     System.out.print(s.charAt(i));
           	  }else{
           	 	 System.out.println();
           	 }
           }
      }     
       

      public static void main(String[] args){
        	String a = "let's test if this function is doing well? ";
        	cut_String(a);

      }
}

