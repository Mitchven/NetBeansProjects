/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

import java.util.ArrayList;

/**
 *
 * @author gamboama_sd2022
 */
public class MedicineForAllergies extends Medicine{
    ArrayList<Medicine> medicine = new ArrayList<>();

    public MedicineForAllergies() {
    }
    
    public MedicineForAllergies(int iD,String genericName, String brandName, String description, double price,int quantity) {
        super(iD,genericName, brandName, description, price,quantity);
    }

    
    public Medicine getMedicine(int index) {
        return medicine.get(index);
    }
    
    public void populate(){
        medicine.add(new Medicine(0,"Cetirizine", "Zyrtec", "An anthihistamine that treats symptoms such as itching", 20.75,45));
        medicine.add(new Medicine(1,"MEN thole & zink OKS ide", "Calmoseptine(Sachet)", "Used to treat minor cuts,scrapes, or burns", 42,30));
        medicine.add(new Medicine(2,"Loratadine", "Claritin", "Treats symptoms such as itching",18,25));
    }
    
    public void display(Medicine med){
        System.out.printf("%10s %5s %35s %5s %30s %5s %60s %5s %10s %5s %10s","ID","|","GENERIC NAME","|","BRAND NAME","|","DESCRIPTION","|","PRICE","|","QUANTITY\n");
        System.out.printf("%s","-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i< medicine.size();i++){
            System.out.printf("%10s %5s %35s %5s %30s %5s %60s %5s %10s %5s %10s \n",medicine.get(i).getiD(),"|",medicine.get(i).getGenericName(),"|",medicine.get(i).getBrandName(),"|",medicine.get(i).getDescription(),"|",medicine.get(i).getPrice(),"|",medicine.get(i).getQuantity());
        }
        
    }

    
}
