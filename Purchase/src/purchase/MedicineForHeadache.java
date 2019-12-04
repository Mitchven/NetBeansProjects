/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupB
 */
public class MedicineForHeadache extends Medicine {
    ArrayList<Medicine> medicine = new ArrayList();

    public MedicineForHeadache() {
    }
    
    
    public MedicineForHeadache(int iD,String genericName, String brandName, String description, double price,int quantity) {
        super(iD,genericName, brandName, description, price,quantity);
    }
    
    public void populate(){
        medicine.add(new Medicine(0,"Paracetamol","Biogesic","Relief of minor aches such as headache",4,25));
        medicine.add(new Medicine(1,"Paracetamol","Neozep Forte","Used for the relief of headache",5,40));
        medicine.add(new Medicine(2,"Ibuprofen","Advil","Used for the relief of headache",8.50,10));
    }
    public void display(Medicine med){
        System.out.printf("%10s %5s %35s %5s %30s %5s %50s %5s %10s %5s %10s","ID","|","GENERIC NAME","|","BRAND NAME","|","DESCRIPTION","|","PRICE","|","QUANTITY\n");
        System.out.printf("%s","--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i< medicine.size();i++){
            System.out.printf("%10s %5s %35s %5s %30s %5s %50s %5s %10s %5s %10s\n",medicine.get(i).getiD(),"|",medicine.get(i).getGenericName(),"|",medicine.get(i).getBrandName(),"|",medicine.get(i).getDescription(),"|",medicine.get(i).getPrice(),"|",medicine.get(i).getQuantity());
        }
        
    }
    
    private void add(int ID, String genericName, String brandName, double price, int quantity, double d) {
    }

    public Medicine getMedicine(int index) {
        return medicine.get(index);
    }
}
