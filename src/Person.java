/**
 * API - Javadocs
 */
public class Person {
    // 1.Instance Variable
    private int id;
    private String firstName;
    private String lastName;

    // 2.Constructors
    public Person(){}

    /**
     * @param firstName
     * @param lastName
     * @param id
     */
    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName ;
        this.id  = id;
    }

    // 3.Getters & Setters
    /*public String toString(){
         *//** When we use the super keyword:
          * For example : return super.toString()*//*
        return "String";
    }*/

    public String toString(){
        String str = "The full name: " + firstName + " " + lastName + "\n" + "ID is: " + id;
        return str;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public int getId(){
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(Person obj){
        return this.id == obj.id && this.firstName.equals(obj.firstName) && this.lastName.equals(obj.lastName);

    }

}
