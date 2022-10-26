

package moonaz;
  
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class reset{
    private static Scanner x;
    public static void resetpass (String editTerm)
    {
        
        String filepath="info.txt";
      String tempFile = "temp.txt";
      File oldFile = new File(filepath);
      File newFile = new File(tempFile);
      String ID = "";
      String pass = "";
      String old_bal = "";
      DecimalFormat decimalFormat=new DecimalFormat("#");
      try {
          FileWriter fw = new FileWriter(tempFile, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter pw = new PrintWriter(bw);
          x = new Scanner(new File(filepath));
          x.useDelimiter("[,\n]");
          while (x.hasNext()) {
              ID = x.next();
              pass = x.next();
              old_bal = x.next();
  
              if (ID.equals(editTerm)) {
                Scanner scn =new Scanner(System.in);
                System.out.println("enter new passward");
                String newpas=scn.nextLine();
               System.out.println("Conform with old passward");
                String conformpasward=scn.nextLine();
                
                         if(conformpasward.equals(pass)  ){
                          pw.println(ID + "," + newpas + "," + old_bal);
                          System.out.println("passward changed successfully");
                            }
                          else {
                            
                            System.out.println("Wrong Passward");
                            pw.println(ID + "," + pass + ","+ old_bal);
                          }
                        
                       

              } else {
                  pw.println(ID + "," + pass + ","+ old_bal);
              }
          }
          x.close();
          pw.flush();
          pw.close();
          oldFile.delete();
          File dump = new File(filepath);
          newFile.renameTo(dump);
      } catch (Exception e) {
          System.out.println(e);
          System.out.println(e.getMessage());
          System.out.println("check");
      } 
  }
  

}