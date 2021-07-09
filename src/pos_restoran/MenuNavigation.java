/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran;

import java.awt.Window;
import javax.swing.JFrame;
import pos_restoran.Customer.Pemesanan_page;
import pos_restoran.Dashboard.AdminDashboard;
import pos_restoran.Dishess.CreateDishes;
import pos_restoran.Dishess.DishesList;
import pos_restoran.Meja.CreateMeja;
import pos_restoran.Meja.MejaList;
import pos_restoran.login_page;

/**
 *
 * @author User
 */
public class MenuNavigation {
    
    public void adminDashboard(Window current){
        AdminDashboard admin = new AdminDashboard();
        admin.setVisible(true);
        current.setVisible(false);
    }
    
    // dish application
    public void dishList(Window current){
        DishesList dishList = new DishesList();
        dishList.setVisible(true);
        current.setVisible(false);
    }
    
    public void createDish(Window current){
        CreateDishes dishList = new CreateDishes();
        dishList.setVisible(true);
        current.setVisible(false);
    }
    
    // meja application
    public void createMeja(Window current){
        CreateMeja createMeja = new CreateMeja();
        createMeja.setVisible(true);
        current.setVisible(false);
    }
    
    public void mejaList(Window current){
        MejaList mejaList = new MejaList();
        mejaList.setVisible(true);
        current.setVisible(false);
    }
    public void loginPage(Window current){
        login_page login = new login_page();
        login.setVisible(true);
        current.setVisible(false);
    }
     public void pemesananPage(Window current){
        Pemesanan_page pemesanan = new Pemesanan_page();
        pemesanan.setVisible(true);
        current.setVisible(false);
    }
    // redirect to other jForm with data carier
    public void openMenuWithData(Window current , JFrame nextFrame)
    {
        nextFrame.setVisible(true);
        current.setVisible(false);
    }
    
}
