package poredjenje.dva.stringa.po.duzini;
import java.util.*;
public class PoredjenjeDvaStringaPoDuzini {

       public static void main(String[] args) {
           
           String s1, s2;
           
           Scanner in = new Scanner (System.in);
           System.out.println("Unesite prvi string: ");
           s1 = in.nextLine();
           
           System.out.println("Unesite drugi string: ");
           s2 = in.nextLine();
           
           if (s1.compareTo(s2)>0)
               System.out.println("Prvi string je duži od drugoga.");
           else if (s1.compareTo(s2)<0)
               System.out.println("Prvi string je kraći od drugoga.");
           else
               System.out.println("Stringovi su jednake dužine");
    }
    
}
