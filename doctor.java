
package tfzfhms;

import java.util.Scanner;
public class doctor {
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        did = input.nextLine();
        System.out.print("Name: ");
        dname = input.nextLine();
        System.out.print("Specilization: ");
        specilist = input.nextLine();
        System.out.print("Work time: ");
        appoint = input.nextLine();
        System.out.print("Qualification: ");
        doc_qual = input.nextLine();
        System.out.print("room no.: ");
        droom = input.nextInt();
    }
    
    
    void doctor_info()
    {
        System.out.printf(did +" "+dname + "  "+ specilist + " " + appoint + " " + doc_qual + " " + droom);
        System.out.println("");
    }
}
