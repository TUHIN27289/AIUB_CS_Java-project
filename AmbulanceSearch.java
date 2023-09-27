
package tfzfhms;



import java.util.Scanner;

public class AmbulanceSearch  extends HospitalManagement{
    String driver_name,driver_phn_number,driver_address;
    int driver1_id,am1_cost=10000,am2_cost=15000,am3_cost=20000,am4_cost=25000;
    int driver_int;
    int hireambulance;
    Scanner input=new Scanner(System.in);
    public void HireAmbulance(){
       //Ambulance_show1();
       
        System.out.print("Enter Driver  id   : ");
        driver1_id=input.nextInt();
         
                      if(driver1_id==1)
                      {
                          System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address      "+"Cost");
                          System.out.print(driver1_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                          System.out.println("    "+am1_cost);
                          
                          
                      }
                      else if(driver1_id==2){
                          System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address        "+"Cost");
                          System.out.print(driver1_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                          System.out.println("    "+am2_cost);  
                      }
                      else if(driver1_id==3){
                          System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address        "+"Cost");
                          System.out.print(driver1_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                          System.out.println("    "+am3_cost);  
                      }
                      else if(driver1_id==4){
                          System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address         "+"Cost");
                          System.out.print(driver1_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                          System.out.println("    "+am4_cost);  
                      }
                      else{
                          System.out.println(" Not avaiable ");
                      }
                      
                      
    }
    
    public void Ambulance_show1(){
        System.out.println(driver1_id+"      "+driver_name+"     "+driver_phn_number+"     "+driver_address);
        
        System.out.println("");
        
    }
    
     public void search1(){
                      System.out.print("Enter Driver  id   : ");
                      driver1_id=input.nextInt();
        switch (driver1_id) {
            case 1:
                System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address");
                 System.out.println(driver1_id+"           "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                System.out.println("");
                break;
            case 2:
                System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address");
                System.out.println(driver1_id+"           "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                break;
            case 3:
                System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address");
                System.out.println(driver1_id+"           "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                break;
            case 4:
                System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address");
                 System.out.println(driver1_id+"           "+driver_name+"     "+driver_phn_number+"     "+driver_address);
                break;
            default:
                System.out.println("NOT Available");
                break;
        
                  }
     }
}
