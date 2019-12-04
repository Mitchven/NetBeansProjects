
package purchase;

import java.util.ArrayList;

public class MedicineForCough extends Medicine{

    public MedicineForCough() {
    }

    public MedicineForCough(int iD,String genericName, String brandName, String description, double price,int quantity) {
        super(iD,genericName, brandName, description, price,quantity);
    }
    

    ArrayList<Medicine> medicine = new ArrayList<>();
    private Medicine price;


    
    public void totalAmountToPay(Medicine e) {
        System.out.println(e.getPrice());
    }
    
    public Medicine getMedicine(int index) {
        return medicine.get(index);
    }
    
    public void populate(){
        medicine.add(new Medicine(0,"Paracetamol", "Decolgen Forte", "Used for the relief of clogged nose,runny nose and postnasal drip",8,35));
        medicine.add(new Medicine(1,"Ambroxol", "Myracof", "Used for the relief of cough", 5,50));
        medicine.add(new Medicine(2,"Carbocisteine","Solmux","Relief cough",10.50,15));
    }
    
    public void display(Medicine med){
        System.out.printf("%10s %5s %35s %5s %30s %5s %70s %5s %10s %5s %10s","ID","|","GENERIC NAME","|","BRAND NAME","|","DESCRIPTION","|","PRICE","|","QUANTITY\n");
        System.out.printf("%s","--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i< medicine.size();i++){
            System.out.printf("%10s %5s %35s %5s %30s %5s %70s %5s %10s %5s %10s \n",medicine.get(i).getiD(),"|",medicine.get(i).getGenericName(),"|",medicine.get(i).getBrandName(),"|",medicine.get(i).getDescription(),"|",medicine.get(i).getPrice(),"|",medicine.get(i).getQuantity());
        }
        
    }
     
    public ArrayList<Medicine>  setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
        return medicine;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }
    
    
    
    

}
