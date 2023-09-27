
package tfzfhms;

import java.util.Scanner;

public class CanteenTfzf {
    int total_canteen_price,take_canteen_money,take_return_money,price_c_food;
    int Rice,Mutton,Beef,Dal,Burger,Pizza,Chicken_fry,coke,sprite,ice_cream,tea,coffee;
    String name;
    Scanner input=new Scanner(System.in);
    void Choose_and_Order(){
        System.out.print("Enter Quantity of Burger        : ");
        Burger=input.nextInt();
        System.out.print("Enter Quantity of Pizza         : ");
        Pizza=input.nextInt();
        System.out.print("Enter Quantity of Tea           : ");
        tea=input.nextInt();
        System.out.print("Enter Quantity of Coffee        : ");
        coffee=input.nextInt();
        System.out.print("Enter Quantity of Rice          : ");
        Rice=input.nextInt();
        System.out.print("Enter Quantity of Mutton        : ");
        Mutton=input.nextInt();
        System.out.print("Enter Quantity of Beef          : ");
        Beef=input.nextInt();
        System.out.print("Enter Quantity of Chicken Fri   : ");
        Chicken_fry=input.nextInt();
        System.out.print("Enter Quantity of Coke          : ");
        coke=input.nextInt();
        System.out.print("Enter Quantity of Sprite        : ");
        sprite=input.nextInt();
        System.out.print("Enter Quantity of Ice Cream     : ");
        ice_cream=input.nextInt();
        System.out.println("Thanks for order");
        System.out.println("");
        
        
        System.out.println("Price of Burger is         : "+Burger+" X "+300+" = "+300*Burger);
        
        System.out.println("Price of Pizza  is         : "+Pizza+" X "+500+" = "+500*Pizza);
        
        System.out.println("Price of Tea    is         : "+tea+" X "+90+" = "+90*tea);
        
        System.out.println("Price of Coffee is         : "+coffee+" X "+180+" = "+180*coffee);
        
        System.out.println("Price of Rice  is          : "+Rice+" X "+20+" = "+20*Rice);
        
        System.out.println("Price of Mutton is         : "+Mutton+" X "+200+" = "+Mutton*200);
        
        System.out.println("Price of Beef is           : "+Beef+" X "+220+" = "+Beef*220);
       
        System.out.println("Price of Chicken Fri is    : "+Chicken_fry+" X "+300+" = "+Chicken_fry*300);
        
        System.out.println("Price of Coke is           : "+coke+" X "+150+" = "+coke*150);
        
        System.out.println("Price of Sprite is         : "+sprite+" X "+100+" = "+sprite*100);
        
        System.out.println("Price of Ice Cream is      : "+ice_cream+" X "+250+" = "+ice_cream*250);
        total_canteen_price=+300*Burger+500*Pizza+90*tea+180*coffee+20*Rice+Mutton*200+Beef*220+Chicken_fry*300+coke*150+sprite*100+ice_cream*250;
        take_return_money=total_canteen_price-take_canteen_money;
       
        
         System.out.println("Canteen Bill is         : "+total_canteen_price);
         System.out.print("Enter money for payment : ");
        take_canteen_money=input.nextInt();
         
        if(total_canteen_price>take_canteen_money){
            System.out.println("Not Enough money\nOrder is cancel\nPlease Cheeck it\nOrder again");
        }
        else if(total_canteen_price<take_canteen_money)
        {
            take_return_money=take_canteen_money-total_canteen_price;
            System.out.println("Return Money is : "+take_return_money);
             System.out.println("Payemnt is ok");
             System.out.println("Thank You");
        }
    }
    void Add_new_Food_item(){
        System.out.print("Enter Food Item Name :  ");
        name=input.next();
        System.out.print("Enter Food price     :  ");
        price_c_food=input.nextInt();
        
    }
   void show_food(){
       System.out.println(name +"      "+price_c_food+"");
       System.out.println("");
   }
    
}
