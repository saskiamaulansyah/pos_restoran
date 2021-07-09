/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_restoran.Customers;

/**
 *
 * @author User
 */
public class ListMejaDto {
    private int id;
    private String noMeja;
    
    public ListMejaDto(){
    }
    
    public ListMejaDto(int id, String noMeja){        
        this.id = id;
        this.noMeja = noMeja;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
       return noMeja;
    }
    
}
