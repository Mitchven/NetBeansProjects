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
public class ListOfMedicineForCough {
    ArrayList<MedicineForCough> mediCough = new ArrayList<>();
    
    public boolean updateMed(int ID, int quantity) {
        for (MedicineForCough a : mediCough) {
            if (a.getiD() == ID) {
                if (a.getQuantity() >= quantity) {
                    a.setQuantity(a.getQuantity() - quantity);
                    System.out.println(a.getQuantity());
                    add(ID, a.getGenericName(), a.getBrandName(),a.getDescription(),a.getPrice(), quantity);
                    return true;
                } else if (a.getQuantity() == 0) {
                    System.out.println("There are no available medicine.");
                } else {
                    System.out.println("There are only " + a.getQuantity() + " available.");
                    break;
                }
            }
        }
        return false;
    }

    private void add(int ID, String genericName, String brandName, String description, double price, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

