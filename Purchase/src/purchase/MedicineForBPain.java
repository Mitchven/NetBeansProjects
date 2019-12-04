
package purchase;

import java.util.ArrayList;

public class MedicineForBPain extends Medicine{

    ArrayList<Medicine> medicine = new ArrayList<>();

    public MedicineForBPain() {
    }
    
    public MedicineForBPain(int iD,String genericName, String brandName, String description, double price,int quantity) {
        super(iD,genericName, brandName, description, price,quantity);
    }
    
    
    public Medicine getMedicine(int index) {
        return medicine.get(index);
    }

    public void populate(){
        medicine.add(new Medicine(0,"PhenylephrineHCI Paracetamol", "Bioflu", "Used for the relief of body aches", 7.50,20));
        medicine.add(new Medicine(1,"Ibuprofen + Paracetamol", "Alaxan FR", "Used for the relief of mild to moderately severe pain", 8,35));
        medicine.add(new Medicine(2,"Mefenamic Acid", "Dolfenal", "Used for the short-term treatment of mild to moderate pain from various conditions",15.50,25 ));
    }
    
    public void display(Medicine med){
        System.out.printf("%10s %5s %35s %5s %30s %5s %90s %5s %10s %5s %10s","ID","|","GENERIC NAME","|","BRAND NAME","|","DESCRIPTION","|","PRICE","|","QUANTITY\n");
        System.out.printf("%s","-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i< medicine.size();i++){
            System.out.printf("%10s %5s %35s %5s %30s %5s %90s %5s %10s %5s %10s \n",medicine.get(i).getiD(),"|",medicine.get(i).getGenericName(),"|",medicine.get(i).getBrandName(),"|",medicine.get(i).getDescription(),"|",medicine.get(i).getPrice(),"|",medicine.get(i).getQuantity());
        }
        
    }

}
