package moonaz;
  
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class cashout implements operation{
    private static Scanner x;




    
    public  int withdrawmoney (String filepath, String editTerm,int bal,int stat)
    {
       
        int ok=0;
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
                 //
                  int new_bal=decimalFormat.parse(old_bal).intValue();
                  //System.out.println(new_bal);

                        if(stat==1){

                          new_bal=new_bal - bal;
                         if(new_bal>=0  ){
                          String s=String.valueOf(new_bal);
                          pw.println(ID + "," + pass + "," + s);
                            ok=1;}
                          else {
                            //System.out.println(old_bal);
                            System.out.println("insufficient balance");
                             pw.println(ID + "," + pass + ","+ old_bal);
                             ok=0;
                          }
                        }
                        if(stat==2)
                        {
                            new_bal=new_bal + bal; 
                            String s=String.valueOf(new_bal);
                            pw.println(ID + "," + pass + "," + s);
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
      return ok;
  }
  

}