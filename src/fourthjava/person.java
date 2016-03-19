/*------------------------------------------------*/
// Person Class
// contains name,address and age of person.
// Also contains dog attribute for 1 dogs
// Contains the getters/setters for all attributes
// there's a null constructor and init constructor
//
/*-------------------------------------------------*/

package fourthjava;

/**
 *
 * @author Pio O'Connell
 */
public class person {
    private String Name;
	private int age;
	private String Address;
	static public dog doggie;
	
	
	public person (String Name0,int age0,String Address0){
		this.Name = Name0;
		this.Address = Address0;
		this.age = age0;
	
		}
	
	public person (){
		
	}	


	public void setName(String Name0){
		this.Name = Name0;
	}
	
	public String getName(){
		return Name;
	}
	
	public void setAddress(String Address0){
		this.Address = Address0;
	}
	
	public String getAddress(){
		return Address;
	}

	public void setAge(int age0){
		this.age = age0;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setDog(dog doggie0)
	{
		doggie = doggie0;
	}

	public dog getDog()
	{
		return doggie;
	}
	public String toString (){
		
		return( this.Name +" \t\t"+this.Address+"\t\t"+this.age+"    'owns'  "+ this.doggie.getName()+"  "+this.doggie.getAge());	
		// to get proper formatting,it would be better to read into fixed width table first and display
	}
}
