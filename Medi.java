/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfzfhms;

import java.util.Scanner;

public class Medi {

        
        void Medi1(){
       // System.out.println("1.Napa : 2 \n2 2.Napa Extra : 4 \n3.Fexo : 5\n4.Tufnil : 5 \n5.Bizoran : 10 \n6.DonA : 3 \n7.Emistat : 7 \n8.Belko : 8 \n9.Cal-20 : 1 \n10.Antazol : 250");
            System.out.println("Bizoran  "+"Square Pharmaceuticals Limited "+"10 ");
            System.out.println("DonA"+"Beximco Pharmaceuticals Limited"+"3");
            System.out.println("Emistat"+"Square Pharmaceuticals Limited"+"7");
            System.out.println("Beklo"+"Incepta Pharmaceuticals Limited"+"8");
            System.out.println("Calbo-20"+"Square Pharmaceuticals Limited"+"5");
            System.out.println("Antazol"+"Beximco Pharmaceuticals Limited"+"250");
            System.out.println("");
            System.out.println("");
               
            
        Scanner m1=new Scanner (System.in);
        int Corex,Nytra,Brufa,Pride,bizoran,dona,em,bel,cal,antazol,total;
        
       /* napae=m1.nextInt();
        fexo=m1.nextInt();
        tufnil=m1.nextInt();
        bizoran=m1.nextInt();
        dona=m1.nextInt();
        em=m1.nextInt();
        bel=m1.nextInt();
        cal=m1.nextInt();
        antazol=m1.nextInt();
        
*/     
       
       System.out.print("Enter Quantity of Corex        :  ");
       Corex=m1.nextInt();
       System.out.print("Enter Quantity of Natra        :  ");
       Nytra=m1.nextInt();
       System.out.print("Enter Quantity of Brufa        :  ");
       Brufa=m1.nextInt();
       System.out.print("Enter Quantity of Pride        :  ");
       Pride=m1.nextInt();
       System.out.print("Enter Quantity of Bizoran      :  ");
       bizoran=m1.nextInt();
       System.out.print("Enter Quantity of DonA         :  ");
       dona=m1.nextInt();
       System.out.print("Enter Quantity of Emistat      :  ");
       em=m1.nextInt();
       System.out.print("Enter Quantity of Belko        :  ");
       bel=m1.nextInt();
       System.out.print("Enter Quantity of Cal-20       :  ");
       cal=m1.nextInt();
       System.out.print("Enter Quantity of Antazol      :  ");
       antazol=m1.nextInt();
        System.out.println("");
        System.out.println("");
       System.out.println("Price of Corex         : "+Corex+"x"+2+" = "+Corex*2);
       System.out.println("Price of Nytra         :  "+Nytra+"x"+4+" = "+Nytra*4);
       System.out.println("Price of Brufa         : "+Brufa+"x"+5+" = "+Brufa*5);
       System.out.println("Price of Pride         : "+Pride+"x"+5+" = "+Pride*5);
       System.out.println("Price of Bizoran       : "+bizoran+"x"+10+" = "+bizoran*5);
       System.out.println("Price of Bizoran       : "+dona+"x"+3+" = "+dona*5);
       System.out.println("Price of Emistat       : "+em+"x"+7+" = "+em*5);
       System.out.println("Price of Belko         : "+bel+"x"+8+" = "+bel*8);
       System.out.println("Price of Cal-20        : "+cal+"x"+1+" = "+cal*1);
       System.out.println("Price of Antazol       : "+antazol+"x"+250+" = "+antazol*250);
       total=((Corex*2)+(Nytra*4)+(Brufa*5)+(Pride*5)+(bizoran*5)+(dona*5)+(em*5)+(bel*8)+(cal*1)+(antazol*250));
        System.out.println("TOtal price is : "+total);
        }

}