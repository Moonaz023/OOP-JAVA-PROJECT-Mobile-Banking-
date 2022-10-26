import moonaz.*;
import java.util.Scanner;
// Maccount  01711111222

public class PocketBank 
{
    private static Scanner x;
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Welcome to PocketBank   ");
        System.out.println("_________________________________");
        System.out.println("1.Login");
        System.out.println("2.Creat a new account");
        System.out.println("enter command number");
        int what=scn.nextInt();
        //--------------------->login
        if(what==1){
            scn.nextLine();
        String id;
        String pasward;
        System.out.println("enter account number");
        id=scn.nextLine();
        System.out.println("enter Passward");
        pasward=scn.nextLine();
       
        access acc;
        acc=new Login(id,pasward);
        int y1=acc.loogin(); 

        if(y1==1){ 
            System.out.println("1.send money");
            System.out.println("2.cashout");
            System.out.println("3.Balance");
            System.out.println("4.Reset passward");
            System.out.println("5.Logout");
            while(true){
            System.out.println("enter command number");
            int command=scn.nextInt();
            c_outpanel C_O=new c_outpanel();
            if(command==2){
            C_O.withdraw(id); }
            if(command==1){
            C_O.send(id);}
            if(command==3){
                String p="info.txt";
                balancecheck ac_bal=new balancecheck();
                String y4=ac_bal.balance(p,id);
                System.out.println("Current balance is "+y4);
            }
            if(command==4){
              reset rsp=new reset();
              rsp.resetpass (id);
            }
            if(command==5){
                break;
              }
           }
        }
    }
    //----------------------->new account
    if(what==2){
            newac ac=new newac();
            ac.newacc();
           
    }

    }
    
}
