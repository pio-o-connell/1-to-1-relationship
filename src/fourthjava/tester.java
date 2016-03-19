/*-----------------------------------------------------------------------*/
//Program implements a 1-to-1 relationship between
//		Person : name,address and age
//		Dog	   : name,age
//	i.e. 1 person can own 1 dog
//For the purpose of this program,I have wrote tester code to demonstrate
//the relationship working
/*-----------------------------------------------------------------------*/
package fourthjava;

/**
 *
 * @author Pio O'Connell
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        person A = new person("pio", 44, "mallow");
        dog B = new dog("sammy", 12);

        B.setOwner(A);

        A.setDog(B);

        System.out.println(A);
        System.out.println(B);

    }

}
