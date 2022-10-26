package moonaz;

import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public  class  newac 
{   
    public  void newacc() {
        String num ,pass;
        try {
           FileWriter writee =new FileWriter("info.txt",true);
           Scanner input =new Scanner(System.in);
           String filepathh="info.txt";
           num=input.nextLine();

           check exisist=new check();
           int y3=exisist.find(filepathh,num);
           if(y3==1){
            System.out.println("Already have a account");
           }
           else{
           pass=input.nextLine();
           writee.write(num +","+pass+",0\r\n");
          // writee.write(pass);
           writee.close();
           System.out.println("Account created successfully");
        }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
