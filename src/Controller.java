public class Controller {
    public static void main(String [] args){
        Person p1 = new Person("Bilal", "Shkoor", 01234566);
        Person p2 = new Person("Bilal", "Shkoor", 01234566);

        System.out.println(p1);
        //Set/edit the ID
        p1.setId(10293949);

        // Check the equality of two instances
        System.out.println(p1.equals(p2));

    }
}
