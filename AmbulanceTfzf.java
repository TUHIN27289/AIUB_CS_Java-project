
package tfzfhms;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

public class AmbulanceTfzf implements Ambulance{
    String driver_name,driver_phn_number,driver_address,driver_id;
    int driver_int;
    Scanner input= new Scanner(System.in);
    AmbulanceTfzf A[]=new AmbulanceTfzf[5];
    int m;
       

    @Override
    public void Ambulance_show(){
        System.out.println(driver_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
        System.out.println("");
    }
    
    void show_Ambulance(){
        if(driver_int==1){
            System.out.println("Heart Attack & Heart Diseases ");
            System.out.println("Refered TFZF to Dhaka Medical College & Hospital ");
           
        }
        else if(driver_int==2)
        {
            System.out.println("Stroke ");
            System.out.println("Refered TFZF to Rajshahi Medical College & Hospital ");
        }
    }
                  /*public String searchItem(){
                        // int p=m1.length;
                        System.out.print("Enter Driver  id");
                        driver_id=input.next();
                         for(int i=0;i<A.length;i++){
                         if(A[i]!=null){
                         if(A[i].driver_id.equals(driver_id));
                         return driver_id ;
                       }
                         }
        return driver_name;
        
                  }*/
                public void search2(){
                       System.out.print("Enter Driver  id   : ");
                        driver_id=input.next();
                        if(driver_id=="A-0001"){
                            System.out.println(driver_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                        }
                        else if(driver_id=="A-0002"){
                             System.out.println(driver_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                        }
                        else if(driver_id=="A-0003"){
                             System.out.println(driver_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                        }
                        else if(driver_id=="A-0003"){
                            System.out.println(driver_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                        }
                        else{
                            System.out.println("NOT Available");
                        }
                  }
                 
                  
}
       
                  

        
                  
                                 