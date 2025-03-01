package projetofinalbd;

import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainTest {
    /*
    CÓDIGO PARA COMMIT NO GITHUB
    
    cd "LOCAL DO ARQUIVO"
    git add .
    git commit - m "comentário"
    git push -u origin main
    */
    
       public static void main(String[] args) throws SQLException {

        Connection con = null; //cria a connection
        CustomerDAO dao = new CustomerDAO();
        
        //dao.showCustomers();
        //dao.deleteCustomer();;;
        //dao.updateCustomer(c, 0);
        //dao.showCustomers();

        System.out.println(dao.getCustomers());     
    }
}

