/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;

/**
 *
 * @author 2ndyrGroupB
 */
public class Pharmacists {

    Scanner input = new Scanner(System.in);
//    ArrayList<Medicine> medicine = new ArrayList();
    //ArrayList<ArrayList<String>> medicine = new ArrayList<ArrayList<String>>();

    public void login() {
        for (int i = 0; i <= 3; i++) {
            System.out.print("Enter your username.\nUsername: ");
            String input1 = input.nextLine();
            if ("mars".equals(input1)) {
                System.out.print("Enter your password.\nPassword: ");
                String input2 = input.nextLine();
                if ("p@ssw0rd".equals(input2)) {
                    System.out.println("You have successfully logged in!");
                    
                    

                } else {
                    System.out.println("Incorrect Password... Try Again with username!!");
                }

            } else {
                System.out.println("Invalid Email Address!!");

            }

        }

    }

    public Medicine addMedicine(Medicine e) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        int size = e.getMedicineList().size() + 1;
        System.out.println("Input iD: ");
        int iD = input.nextInt();
        System.out.print("Input Generic Name: ");
        String genericName = input1.nextLine();
        System.out.print("Input Brand Name: ");
        String brandName = input2.nextLine();
        System.out.println("Description: ");
        String description = input.next();
        System.out.print("Input price: ");
        double price = input3.nextDouble();
        System.out.println("Input quantity: ");
        int quantity = input4.nextInt();
        System.out.println("Choose Type of Medicine: \n1 ---- Cough\n2 ---- Body Pain\n3 ---- Headache\n4 ---- Allergies");
        System.out.print("Choose Medicine Type: ");
        int option1 = input.nextInt();
        switch (option1) {
            case 1:
                e = new MedicineForCough(iD,genericName,brandName,description,price,quantity);
                return e;
            case 2:
                e = new MedicineForBPain(iD,genericName,brandName,description,price,quantity);
                return e;
            case 3:
                e = new MedicineForHeadache(iD,genericName,brandName,description,price,quantity);
                return e;
            case 4:
                e = new MedicineForAllergies(iD,genericName,brandName,description,price,quantity);
                return e; 
            default:
                break;
        }
        return e;
    }


}
