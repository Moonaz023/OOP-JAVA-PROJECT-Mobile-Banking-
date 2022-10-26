package moonaz;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Login extends access {
    public Login(String id ,String pasward){
       super(id, pasward);
    }
    //public static int loogin  (String id ,String pasward)
    public int loogin  ()
    {
       
        File inputFile = new File("info.txt");
        int k=0;
        String nam;
        String pass;
        String balance;
        Scanner in =new Scanner(System.in);
        nam=id;
        pass=pasward;
        try {
                in = new Scanner(new File("info.txt"));
               while (in.hasNextLine())
               {
                 String s = in.nextLine();
                 String[] sArray = s.split(",");
    
                 if (nam .equals(sArray[0]) && pass.equals(sArray[1]))
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
           }
       if(k==1)
        System.out.println("Login Successful");
        if(k==0)
        System.out.println("Login Failed");
    
        return k;
      }
}