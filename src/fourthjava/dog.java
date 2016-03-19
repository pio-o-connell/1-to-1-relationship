/*------------------------------------------------*/
// Dog Class
// contains name and age of dog, also owner attribute
// Contains the getters/setters for all attributes
// there's a null constructor and init constructor
//
/*-------------------------------------------------*/
package fourthjava;

/**
 *
 * @author Pio OConnell
 */
public class dog {

    private String Name = "";
    private int Age = 0;
    public person owner;

    public dog(String Name0, int Age0) {
        this.Name = Name0;
        this.Age = Age0;
    }

    public dog() {

    }

    public void setName(String Name0) {
        this.Name = Name0;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age0) {
        this.Age = Age0;
    }

    public int getAge() {
        return Age;
    }

    public void setOwner(person owner1) {
        owner = owner1;
    }

    public person getOwner() {
        return owner;
    }

    public String toString() {

        return (this.Name + " , " + this.Age + "\t\t 'belongs to' \t\t" + this.owner.getName() + "  " + this.owner.getAddress() + "    " + this.owner.getAge());
        // to get proper formatting,it would be better to read into fixed width table first and display
    }
}
