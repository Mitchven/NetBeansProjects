/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;
import java.util.ArrayList;
import java.util.Scanner;


public class ListOfCustomers extends Medicine {

    Scanner input = new Scanner(System.in);
    ArrayList<Adult> adults;
    ArrayList<SeniorCitizen> seniors;
    private String name;
    private String password;
    private int age;
    private double total;
    Scanner inputName = new Scanner(System.in);
    Scanner inputPass = new Scanner(System.in);
    Scanner inputAge = new Scanner(System.in);
    MedicineForHeadache mh = new MedicineForHeadache();
    MedicineForCough mc = new MedicineForCough();
    MedicineForBPain mp = new MedicineForBPain();
    MedicineForAllergies ma = new MedicineForAllergies();

    public ListOfCustomers() {
        adults = new ArrayList();
        seniors = new ArrayList();
        adults.add(new Adult("Mars", 20, "marimars", 0.0));
        seniors.add(new SeniorCitizen("Mitchven", 60, "mitchven99", 0.0));
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
        } else if (age >= 55) {
            seniors.add(new SeniorCitizen(name, age, password, total));
            System.out.println("☺☺☺☺☺☺ You are registered! ☺☺☺☺☺☺");
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

    public void order() {
        int payable = 0;
        boolean order = false;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        while (order == false) {
            System.out.println("    1 ---- View Available Medicine\n    2 ---- Order Medicine\n    3 ---- Payment\n    4 ---- Logout\n");
            int choice1 = input2.nextInt();
            if (choice1 == 1) {
                System.out.println("    ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ |: THIS MEDICINES IS FOR COUGH :| ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
                mc.display(mc);
                System.out.println("    ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣ o: THIS MEDICINES IS FOR BODY PAINS :o ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
                mp.display(mp);
                System.out.println("    ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠ <: THIS MEDICINES IS FOR HEADACHE :> ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");
                mh.display(mh);
                System.out.println("    ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻ (: THIS MEDICINES IS FOR ALLERGIES :) ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻");
                ma.display(ma);
            } else if (choice1 == 2) {
                System.out.println("What kind of illness you would like to be cured? Choose from the following:\n1.Cough\n2.Body Pain\n3.Headache\n4.Allergies");
                int input3 = input1.nextInt();
                switch (input3) {
                    case 1:
                        System.out.println("   ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ |: THIS MEDICINES IS FOR COUGH :| ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");

                        mc.display(mc);
                        System.out.println("1.Purchase\n 2.Exit");
                        int p = input2.nextInt();
                        if (p == 1) {
                            System.out.print("Input medicine ID to purchase: ");
                            int index = input.nextInt();
                            if (index == 0 || index == 1 || index == 2) {
                                System.out.println("You purchase " + mc.getMedicine(index));
                                System.out.println("Quantity: ");
                                int quan = input1.nextInt();
                                if(quan >= mc.getQuantity()){
                                    System.out.println("It's impossible to purchase "+quan+". You only have "+mc.getMedicine(index).getQuantity()+" in your list.");
                                }else{
                                double price = quan * mc.getMedicine(index).getPrice();
                                System.out.println(price);
                                payable += price;
                                mc.getMedicine(index).setQuantity(mc.getMedicine(index).getQuantity() - quan);
                                }
                            }
                        } else if (p == 2) {
                            System.out.println("Exit! Thank you! ");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("    ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣ o: THIS MEDICINES IS FOR BODY PAINS :o ♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");

                        mp.display(mp);
                        System.out.println("1.Purchase\n 2.Exit");
                        int p1 = input1.nextInt();
                        if (p1 == 1) {
                            System.out.print("Input medicine ID to purchase: ");
                            int index = input2.nextInt();
                            if (index == 0 || index == 1 || index == 2) {
                                System.out.println("You purchase " + mp.getMedicine(index));
                                System.out.println("Quantity: ");
                                int quan = input1.nextInt();
                                if(quan >= mp.getQuantity()){
                                    System.out.println("It's impossible to purchase "+quan+". You only have "+mp.getMedicine(index).getQuantity()+" in your list.");
                                }else{
                                double price = quan * mp.getMedicine(index).getPrice();
                                System.out.println(price);
                                payable += price;
                                mp.getMedicine(index).setQuantity(mp.getMedicine(index).getQuantity() - quan);
                                }
                            }
                        } else if (p1 == 2) {
                            System.out.println("Exit! Thank you! ");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("    ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠ <: THIS MEDICINES IS FOR HEADACHE :> ♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");

                        mh.display(mh);
                        System.out.println("1.Purchase\n 2.Exit");
                        int p2 = input1.nextInt();
                        if (p2 == 1) {
                            System.out.print("Input medicine ID to purchase: ");
                            int index = input2.nextInt();
                            if (index == 0 || index == 1 || index == 2) {
                                System.out.println("You purchase " + mh.getMedicine(index));
                                System.out.println("Quantity: ");
                                int quan = input1.nextInt();
                                if(quan >= mh.getQuantity()){
                                    System.out.println("It's impossible to purchase "+quan+". You only have "+mh.getMedicine(index).getQuantity()+" in your list.");
                                }else{
                                double price = quan * mh.getMedicine(index).getPrice();
                                payable += price;
                                System.out.println(price);
                                mh.getMedicine(index).setQuantity(mh.getMedicine(index).getQuantity() - quan);
                                }
                            }
                        } else if (p2 == 2) {
                            System.out.println("Exit! Thank you! ");
                            break;
                        }
                    case 4:
                        System.out.println("    ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻ (: THIS MEDICINES IS FOR ALLERGIES :) ☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻");
                        ma.display(ma);
                        System.out.println("1.Purchase\n 2.Exit");
                        int p3 = input1.nextInt();
                        if (p3 == 1) {
                            System.out.print("Input medicine ID to purchase: ");
                            int index = input2.nextInt();
                            if (index == 0 || index == 1 || index == 2) {
                                System.out.println("You purchase " + ma.getMedicine(index));
                                System.out.println("Quantity: ");
                                int quan = input1.nextInt();
                                if(quan >= ma.getQuantity()){
                                    System.out.println("It's impossible to purchase "+quan+". You only have "+ma.getMedicine(index).getQuantity()+" in your list.");
                                }else{
                                double price = quan * ma.getMedicine(index).getPrice();
                                payable += price;
                                System.out.println(price);
                                ma.getMedicine(index).setQuantity(ma.getMedicine(index).getQuantity() - quan);
                                }
                            } else if (p3 == 2) {
                                System.out.println("Exit! Thank you! ");
                                break;
                            }
                            break;
                        }
                }
            } else if (choice1 == 3) {
                double discount = 0;
                if (age >= 55) {
                    discount = payable * .2;
                    System.out.println("You have 20% discount, therefore you will just pay = " + discount);
                } else {
                    System.out.println("You will pay = " + payable);
                }
            } else if (choice1 == 4) {
                System.out.println("Thank you " +name+" for using MMG's Pharmacy System. Hope you find this system useful and hope that you enjoy the accompany of the system. COME AGAIN!!");
                order = true;
            }
        }

    }
}

