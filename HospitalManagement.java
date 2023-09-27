
package tfzfhms;

import java.util.Calendar;
import java.util.Scanner;
public class HospitalManagement {
    public static void main(String args[])
    {
        
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome To The TFZF Hospital  ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        doctor[] d = new doctor[200];
        patient[] p = new patient[1000];
        lab[] l = new lab[200];
        fecility[] f = new fecility[20];
        medical[] m = new medical[100];
        staff[] s = new staff[100];
        CanteenTfzf c[]=new CanteenTfzf[15];
        AmbulanceTfzf A[]=new AmbulanceTfzf[5];
        AmbulanceSearch A1[]=new AmbulanceSearch[5];
        Emergency E[]=new Emergency[4];
        int i;
        for(i=0;i<4;i++)
            E[i]=new Emergency();
        for(i=0;i<5;i++)
            A1[i]=new AmbulanceSearch();
        for(i=0;i<5;i++)
            A[i]=new AmbulanceTfzf();
        for(i=0;i<15;i++){
            c[i]=new CanteenTfzf();
        }
        for (i = 0; i < 200; i++)
            d[i] = new doctor();
        for (i = 0; i < 1000; i++)
            p[i] = new patient();
        for (i = 0; i < 200; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new fecility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
        for (i = 0; i < 100; i++)
            s[i] = new staff();
        
        

        d[0].did = "0001";
        d[0].dname = "Dr.Noman Al Mahmud";
        d[0].specilist = "ENT";
        d[0].appoint = "10-2AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 301;
        d[1].did = "0002";
        d[1].dname = "Dr.Hasan Ali";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 302;
        d[2].did = "0003";
        d[2].dname = "Dr.Toukir Ahmed ";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = " MBBS,MS,MD,FCPH";
        d[2].droom = 303;
        d[3].did = "0004";
        d[3].dname = "Dr.Fahim Rahman";
        d[3].specilist = " Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom =    304;
      

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fec_name = "1. Canteen";
        //f[1].fec_name = "2. Addmit Facility ";
        f[1].fec_name = "3. Ambulance";
        f[2].fec_name = "4. Emergency";

        s[0].sid = "22";
        s[0].sname = "Prakash";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        
        c[0].name="Burger";
        c[0].price_c_food=300;
        c[1].name="pizza";
        c[1].price_c_food=500;
        c[2].name="Tea";
        c[2].price_c_food=90;
        c[3].name="Coffe";
        c[3].price_c_food=180;
        c[4].name="Rice";
        c[4].price_c_food=20;
        c[5].name="Mutton";
        c[5].price_c_food=200;
        c[6].name="Beef";
        c[6].price_c_food=220;
        c[7].name="Chicken Fry";
        c[7].price_c_food=300;
        c[8].name="Coke";
        c[8].price_c_food=150;
        c[9].name="Sprite";
        c[9].price_c_food=100;
        c[10].name="Ice Cream";
        c[10].price_c_food=250;
        A[0].driver_id="A-0001";
        A[0].driver_name="Rayhan kabir";
        A[0].driver_phn_number="01790952728";
        A[0].driver_address="Birampur, Dinajpur";
        A[1].driver_id="A-0002";
        A[1].driver_name="Samsul Rahman";
        A[1].driver_phn_number="017907699";
        A[1].driver_address="Phulbari, Dinajpur";
        A[2].driver_id="A-0003";
        A[2].driver_name="TaREK Mahmud";
        A[2].driver_phn_number="017907699";
        A[2].driver_address="Hili, Dinajpur";
        A[3].driver_id="A-0004";
        A[3].driver_name="Taharat Mahmud";
        A[3].driver_phn_number="017907699";
        A[3].driver_address="Parbatipur, Dinajpur";
        A1[0].driver1_id=1;
        A1[0].driver_name="Rayhan kabir";
        A1[0].driver_phn_number="01790952728";
        A1[0].driver_address="Birampur, Dinajpur";
        A1[1].driver1_id=2;
        A1[1].driver_name="Samsul Rahman";
        A1[1].driver_phn_number="017907699";
        A1[1].driver_address="Phulbari, Dinajpur";
        A1[2].driver1_id=3;
        A1[2].driver_name="TaREK Mahmud";
        A1[2].driver_phn_number="017907699";
        A1[2].driver_address="Hili, Dinajpur";
        A1[3].driver1_id=4;
        A1[3].driver_name="Taharat Mahmud";
        A1[3].driver_phn_number="017907699";
        A1[3].driver_address="Parbatipur, Dinajpur";
        
        E[0].cov_p_n="TURZO";
        E[0].cov_p_id="C-0001";
        E[0].cov_p_phn="01790952728";
        E[0].cov_p_hn="BLOCK-D";
        E[0].cov_p_address="MIRPUR";
        
        E[1].cov_p_n="TANIM";
        E[1].cov_p_id="C-0002";
        E[1].cov_p_phn="01790952333";
        E[1].cov_p_hn="BLOCK-A";
        E[1].cov_p_address="MIRPUR";
        
        E[2].cov_p_n="TONOY";
        E[2].cov_p_id="C-0003";
        E[2].cov_p_phn="01790952444";
        E[2].cov_p_hn="BLOCK-C";
        E[2].cov_p_address="MIRPUR";
        
        E[3].cov_p_n="TONNI";
        E[3].cov_p_id="C-0004";
        E[3].cov_p_phn="01790952666";
        E[3].cov_p_hn="BLOCK-E";
        E[3].cov_p_address="MIRPUR";

        Scanner input = new Scanner(System.in);
        int choice, j, c1; 
               int status = 1; 
               int s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("------------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 ==1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------");
                                        //System.out.println("ID \t Name\t Specilist \t Timing \t Qualification \t Room No");
                                        System.out.println("ID    "+"  Name  "+"                     Specilist "+"           Timing "+"             Qualification "+"             Room No");
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Patient\n2.Show Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                            
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 3)
                        {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j <4; j++) {
                                            m[j].find_medi();
                                           // m[j].Medi1();
                                        }
                                        break;
                                    }
                                case 3:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                        //System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("       Medicine    ");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for(j=0;j<4;j++){
                                            m[j].find_medi();
                                           
                                        }
                                         m[j].Medi1();
                                        break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List\n3. Make A Test ");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count4].new_feci();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                        }
                                        break;
                                    }
                                case 3:{
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for(j=0;j<4;j++){
                                            l[j].feci_list();
                                        }
                                        System.out.println("");
                                        l[j].Lab_Report_and_cost();
                                }   
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f[count5].add_feci();count5++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count5; j++) {
                                            f[j].show_feci();
                                        }
                                        break;
                                    }                                       
                            }
                            
                            c1=input.nextInt();
                            switch(c1){
                                case 1:
                                {
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **Canteen**                                                   ");
                        System.out.println("------------------------------------------------------------------------------------");
                                    System.out.println("1. Add New Food");
                                    System.out.println("2. Show Food Item");
                                    System.out.println("3. Order now");
                                    c1=input.nextInt();
                                    switch(c1){
                                        case 1:{                                         
                                            c[count5].Add_new_Food_item();count5++;
                                            break;
                                        }                                 
                                        case 2:{
                                            System.out.println("Name     "+" price ");
                                            for( j=0;j<12;j++){
                                                c[j].show_food();
                                            }
                                                break;
                                            }
                                 
                                
                                          case 3:
                                    {
                                        System.out.println("Name     "+" price ");
                                        for ( j = 0; j <11; j++) {
                                             c[j].show_food();  
                                             
                                        }
                                          c[1].Choose_and_Order();
                                            break;            
                                    }
                                    
                                    }                                                
                        break;
                                }
                                case 2:{
                                    
                                    System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **Ambulance Management**                                                   ");
                        System.out.println("------------------------------------------------------------------------------------");
                                    System.out.println("1. Ambulance Details ");
                                    System.out.println("2. search ambulance");
                                    System.out.println("3. Order now");
                                    c1=input.nextInt();
                                    switch(c1){
                                        case 1:{
                                            System.out.println("");
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **Driver Information**                                                   ");
                        System.out.println("------------------------------------------------------------------------------------");
                                            System.out.println("Driver ID   "+"Driver Name      "+"Phone Number     "+"Address");
                                            System.out.println("");
                                            for(j=0;j<4;j++){
                                                
                                                A[j].Ambulance_show();
                                            }
                                            break;
                                        }
                                        case 2:{  
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **Ambulance Search **                                                   ");
                        System.out.println("------------------------------------------------------------------------------------");
                        
                                                for(j=0;j<4;j++){
                                                    A1[j].search1();
                                                }                                                                                         
                                                break;
                                        }   
                                        case 3:{
                                            for(j=0;j<4;j++){
                                                A1[j].HireAmbulance();
                                            }
                                        }
                                    }
                                   break;
                                }
                                case 3:{
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                      **Emergency Unit **                                                   ");
                        System.out.println("------------------------------------------------------------------------------------");
                                    System.out.println("1. Add Covid-19 Patient ");
                                    System.out.println("2. Show Covid-19 Patient List");
                                    System.out.println("3. Show Non-Covid Patient list");
                                    c1=input.nextInt();
                                    switch(c1){
                                        case 1:
                                        {
                                            E[count4].Add_New_Covid_Patient();count4++;
                                            break;
                                        }
                                        case 2:
                                        {
                                            for(j=0;j<4;j++){
                                                E[j].show_covid_patient_information();
                                            }
                                            break;
                                        }
                                        case 3:
                                        {
                                            for(j=0;j<4;j++){
                                                p[j].patient_info();
                                            }
                                            break;
                                        }
                                    }
                                }
                               
                            }
                            
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }  
                        break;
                         }        
                     case 6:
                    {
                        s6 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s6 == 1)
                        {
                            //String a = "nurse", b = "worker", C = "security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count6].new_staff();count6++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary\t ");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            //if (a.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                //case 3:
                                   // {
                                      //  System.out.println("--------------------------------------------------------------------------------");
                                       // System.out.println("Id \t Name \t Gender \t Salary \t As");
                                        //System.out.println("--------------------------------------------------------------------------------");
                                       // for (j = 0; j < count6; j++)
                                       // {
                                         //   if (b.equals(s[j].desg))
                                            //    s[j].staff_info();
                                        //}
                                       // break;
                                  //  }
                               // case 4:
                                  //  {
                                      //  System.out.println("--------------------------------------------------------------------------------");
                                        //System.out.println("id \t Name \t Gender \t Salary");
                                        //System.out.println("id ");
                                       // System.out.println("--------------------------------------------------------------------------------");
                                       // for (j = 0; j < count6; j++)
                                        //{
                                          //  if (C.equals(s[j].desg))
                                              //  s[j].staff_info();
                                     //   }
                                       // break;
                                  //  }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
