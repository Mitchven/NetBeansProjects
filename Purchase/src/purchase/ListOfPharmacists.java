package purchase;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfPharmacists extends Medicine {

    Scanner input = new Scanner(System.in);
    private String name;
    private String password;
    private int age;
    private double total;
    ArrayList<Adult> adults;
    Scanner inputName = new Scanner(System.in);
    Scanner inputPass = new Scanner(System.in);
    Scanner inputAge = new Scanner(System.in);
    Pharmacists p = new Pharmacists();
    MedicineForHeadache mh = new MedicineForHeadache();
    MedicineForCough mc = new MedicineForCough();
    MedicineForBPain mp = new MedicineForBPain();
    MedicineForAllergies ma = new MedicineForAllergies();

    public ListOfPharmacists() {
        adults = new ArrayList();
        adults.add(new Adult("Mars", 20, "marimars", 0.0));
    }

    public void register() {
        System.out.println("\n☻☻☻☻☻☻ REGISTER ☻☻☻☻☻☻");
        System.out.print("Enter username : ");
        name = inputName.nextLine();
        System.out.print("Enter password : ");
        password = inputPass.nextLine();
        System.out.print("Enter age : ");
        age = inputAge.nextInt();

        if (age < 18 ) {
            System.out.println("You are under age!");
        } else {
            adults.add(new Adult(name, age, password, total));
            System.out.println("☺☺☺☺☺☺ You are Registered Now! ☺☺☺☺☺☺");
        }
    }

    public boolean login() {
        System.out.println("\n♦♦♦♦♦♦ LOG IN ♦♦♦♦♦♦");
        System.out.print("Enter username : ");
        name = inputName.nextLine();

        for (int i = 0; i < adults.size(); i++) {
            if (adults.get(i).getName().equals(name)) {
                while (true) {
                    System.out.print("Enter password : ");
                    password = inputPass.nextLine();
                    if (adults.get(i).getPassword().equals(password)) {
                        System.out.println("☺☺☺☺☺☺ Successfully Login! ☺☺☺☺☺☺");
                        mh.populate();
                        ma.populate();
                        mc.populate();
                        mp.populate();
                        return true;
                    } else {
                        System.out.println("Incorrect password!");
                    }
                }
            } else if (i == adults.size() - 1) {
                System.out.println("☺☺☺☺☺☺ You are not yet registered! ☺☺☺☺☺☺");
            }
        }
        return false;
    }
    public void update(){
        System.out.println("    1 ---- View Medicine\n    2 ---- Add Medicine\n   3 ---- Delete Medicine");
                int choices = input.nextInt();
                if (choices == 1) {
                    System.out.println("    ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ |: THIS MEDICINES IS FOR COUGH :| ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
                    mc.display(mc);
                    System.out.println("    ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣ o: THIS MEDICINES IS FOR BODY PAINS :o ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
                    mp.display(mp);
                    System.out.println("    ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠ <: THIS MEDICINES IS FOR HEADACHE :> ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
                    mh.display(mh);
                    System.out.println("    ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻ (: THIS MEDICINES IS FOR ALLERGIES :) ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻");
                    ma.display(ma);
                } else if (choices == 2) {
//                    p.addMedicine(mh);
                } else if (choices == 3) {
                    
                   
                }
    }

}