
package tfzfhms;

import java.io.*;
import java.util.*;
import java.util.Calendar;
public class staff {
     String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    
    void staff_info()
    {
        System.out.println(sid + "   " + sname + "\t" + sex + "\t" + salary +"\t"+desg);
       /* System.out.println("Staff Id     : "+sid);
        System.out.println("Staff Name   : "+sname);
        System.out.println("Staff Sex    : "+sex);
        System.out.println("Staff salary : "+salary);
        
*/
    }
}
