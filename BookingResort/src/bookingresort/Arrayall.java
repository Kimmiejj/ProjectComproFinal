/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingresort;

/**
 *
 * @author CHISANUCHASOMBOONWAN
 */
public class Arrayall {
    String[ ] name =new String[15];
     int [ ] id = new int[15];
    short[ ] age =new short[15];
    public String name(String choose){
        switch ("name"){
            case "suiteRoom" :
                this.name[0]="suiteRoom";
               break;
            case "deluxeroom" :{
                this.name[0]="deluxeroom";
                break;
            }
            default : 
                System.out.println("Please enter again");
               
        }
    return "name";    
    }
       public int id_card (int id){
           this.id [0 ] =id;
           
           return id;
       }
       public short lifespan(){
        this
       }
    
}
