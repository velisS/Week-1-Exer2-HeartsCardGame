/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author racks
 */
 public abstract class Human{
	 String Role;//to human role (player,dealer)
	 String Name;
	 String Surname;
	 int Age;
	 public Human(String Role) {
		 this.Role=Role;
	 }
	 public void setRoles(String Roles) {Role=Roles;}
	 public void setName(String pname) {Name=pname;}
	 public void setSurname(String psurname) {Surname=psurname;}
	 public void setAge(int age){Age=age;}
	 public String getRoles() {return Role;}
	 public String getName() {return Name;}
	 public String getSurname() {return Surname;}
	 public int getAge(){return Age;}	 
    public abstract void introduceSelf();
}
