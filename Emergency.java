
package tfzfhms;

import java.util.Scanner;

public class Emergency extends patient{
    String cov_p_n,cov_p_id,cov_p_hn,cov_p_phn,cov_p_address;
    String n_cov_p_n,n_cov_p_id,n_cov_p_hn,n_cov_p_phn,n_cov_p_address;
    Scanner input=new Scanner(System.in);
    public void Add_New_Covid_Patient(){
        System.out.print("Enter COvid Patient Name         : ");
        cov_p_n=input.next();
        System.out.print("Enter COvid Patient ID NO        : ");
        cov_p_id=input.next();
        System.out.print("Enter COvid Patient House No     : ");
        cov_p_hn=input.next();
        System.out.print("Enter COvid Patient phone number : ");
        cov_p_phn=input.next();
        System.out.print("Enter COvid Patient Address      : ");
        n_cov_p_address=input.next();      
    }
    public void show_covid_patient_information(){
        System.out.println(cov_p_n+"  "+cov_p_id+"  "+cov_p_phn+"  "+cov_p_hn+"  "+cov_p_address+"   ");
    }
}
