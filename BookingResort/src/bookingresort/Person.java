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

public class Person {
private String name;
private int id_Card;
private short old;

public void Preson( String name, int id_Card,short old ){
    this.name=name;
    this.old=old;
    this.id_Card=id_Card;
}
public String getName(){
return name;
}
public short getOld(){
return old;
}
public int getID_Card(){
return id_Card;
}

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id_Card=" + id_Card + ", old=" + old + '}';
    }
   
     
}
