package moonaz;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class balancecheck {

    
    public static String balance  (String loc,String id)
    {
       
       
        File inputFile = new File(loc);
        String kp=null;
        String nam;
        Scanner in =new Scanner(System.in);
        nam=id;
        try {
                in = new Scanner(new File(loc));
               while (in.hasNextLine())
               {
                 String s = in.nextLine();
                 String[] sArray = s.split(",");
    
                 if (nam .equals(sArray[0]))
                 {
                      kp=sArray[2];
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
    
        return kp;
      }
    
}
