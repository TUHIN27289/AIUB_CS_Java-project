/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfzfhms;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class lab extends LabReport{
    String fecility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}
