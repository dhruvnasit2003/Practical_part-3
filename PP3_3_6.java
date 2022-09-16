//This program is done by Dhruv Nasit(21ce079)
package mypack;
public class Mypac {

    public static void peli(String s)
    {
        int r,sum=0,temp;    
        int n=454; 
        
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("Yes");    
        else    
         System.out.println("No");    
      }  
      
}
Main class
import mypack.Mypac;
public class Main {
    public static void main(String[] args) {
        Mypac m1=new Mypac();
        String st="11011";
        m1.peli(st);

    }
}
