/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran;

import java.awt.Window;
import javax.swing.JFrame;
import pos_restoran.Dashboard.AdminDashboard;
import pos_restoran.Dishess.CreateDishes;
import pos_restoran.Dishess.DishesList;

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
    
    // redirect to other jForm with data carier
    public void openMenuWithData(Window current , JFrame nextFrame)
    {
        nextFrame.setVisible(true);
        current.setVisible(false);
    }
    
}