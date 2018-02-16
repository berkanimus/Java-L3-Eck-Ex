import java.util.*;
public class exercice36
{
  public static int[] max_div(){
    int [] r =new int [10];
   int k=0; int h=0;
    int c;
    for(int i=1; i<=10000; i++){
       c=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
        c++;
        //System.out.println("c est "+c);    
        }
          
      } 
      if (c>k){
        h=0;
        k=c;
        
       Arrays.fill(r,0);
        r[h]=i;
        h++;
        //System.out.println("h est "+h);
      }else  if(c==k && c!=0){
      r[h+1]=i;
      h++;}
       // System.out.println(" "+i+" "+c+"  "+h+" "+k);
    }
  
  
  
  r[r.length-1]=k;
  return r; 
    
}
  public static void main(String[] args)
  {
    int [] t=max_div();
    String s="";
    for(int i=0; i<t.length-1;i++){
     if(t[i]!=0)
      s+=("\n   "+t[i]);
    }
    System.out.println("Among integers between 1 and 10000,\nThe maximum number of divisors was "+t[t.length-1]+"\nNumbers with that many divisors include:"+s);
  }
