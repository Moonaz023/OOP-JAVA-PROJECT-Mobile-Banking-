
package moonaz;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class check {
    
    public static int find  (String location,String id)
    {
       
       
        File inputFile = new File(location);
        int k=0;
        String nam;
        Scanner in =new Scanner(System.in);
        nam=id;
        try {
                in = new Scanner(new File(location));
               while (in.hasNextLine())
               {
                 String s = in.nextLine();
                 String[] sArray = s.split(",");
    
                 if (nam .equals(sArray[0]))
                 {
                      k=1;
                      //System.out.println("balance "+sArray[2]);
                 }
                 else
                 {
                   //
                 }
               }
    
               in.close();
    
           } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("check");
           }
       
        //if(k==0)
        //System.out.println("Invalid recever number");
    
        return k;
      }
}