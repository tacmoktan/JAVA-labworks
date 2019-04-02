/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
/**
 *
 * @author Tashi
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    
    private String firstName,lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String firstName(){
        return this.firstName;
    }
    public String lastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public boolean equals(Object obj){
        if( !(obj instanceof Person) )
            return false;
        Person p = (Person) obj;
        
        if( firstName.equals(p.firstName()) && lastName.equals(p.lastName()) && age == p.getAge())
            return true;
        else
            return false;
    }
    
    @Override
    //we override default hashCode method because two equal objects can be assigned different hashCodes when using default hashCode methods.
    public int hashCode(){
        int prime = 31;
        int result =1;
        result = prime * result + ( (firstName == null)? 0: firstName.hashCode() );
        result = prime * result + ( (lastName == null)? 0: lastName.hashCode() );
        result = prime * result + ( (age <= 0 )? 0: java.lang.Integer.hashCode(age) );
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Suraj","Lohani",90);
        Person p2 = new Person("Suraj","Lohani",90);
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode()); // hashcode: 1818991387
        System.out.println(p2.hashCode()); // hashcode: 1818991387
    }
}
