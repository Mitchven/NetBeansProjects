/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rangie_sqltest;

/**
 *
 * @author gamboama_sd2082
 */
public class Rangie_SqlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestSQL test = new TestSQL();
        TestSQL test1 = new TestSQL();
        test.insertNumbers();
        
        test1.displayRetrieveNumbers();
        
    }
    
}
