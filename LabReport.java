
package tfzfhms;

import java.util.Scanner;

public class LabReport {
    int x_ray,city_scan,mri,ecg,total_report_cost,take_lab_report_cost,return_lab_report_money,choose;
    Scanner input=new Scanner(System.in);
    void Lab_Report_and_cost(){
        System.out.println("Please choose which one do you want to Test and how many times");
       
        System.out.print(" Test X-Ray       :  ");
        x_ray=input.nextInt();
        System.out.print(" Test City Scan   :  ");
        city_scan=input.nextInt();
        System.out.print(" Test MRI         :  ");
        mri=input.nextInt();
        System.out.print(" Test ECG         :  ");
        ecg=input.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Price of X-Ray              : "+x_ray+" X "+500+" = "+x_ray*500);
        System.out.println("Price of City Scan          : "+city_scan+" X "+3000+" = "+city_scan*3000);
        System.out.println("Price of MRI                : "+mri+" X "+2000+" = "+mri*2000);
        System.out.println("Price of X-Ray              : "+ecg+" X "+500+" = "+ecg*500);
        
        total_report_cost=x_ray*500+city_scan*3000+mri*2000+ecg*500;
       // return_lab_report_money=take_lab_report_cost-total_report_cost;
        System.out.println("Total Lab Report Cost       : "+total_report_cost);
          System.out.print("Enter Money for payment     : "+take_lab_report_cost);
        take_lab_report_cost=input.nextInt();
        if(total_report_cost>take_lab_report_cost){
            System.out.println("Not Enough money\n Try Again");
        }
            else if(total_report_cost==take_lab_report_cost||take_lab_report_cost>total_report_cost){
                return_lab_report_money=take_lab_report_cost-total_report_cost;
                    System.out.println("Return money                : "+return_lab_report_money);
                    System.out.println("Payemnt is ok");
                    System.out.println("Thank You");
                    }
            else{
               
                System.out.println("Return Money      : "+return_lab_report_money);
                System.out.println("Payemnt is ok");
                System.out.println("Thank You");
        }
        
        
    }
}
