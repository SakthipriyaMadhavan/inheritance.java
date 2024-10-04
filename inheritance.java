package Demo;
class Car
{
	int price;
	String brand;
	Car(int price ,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	void setPrice(int price)
	{
		this.price=price;
		
	}
	void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String toString()
	{
		return price+" "+brand;
	}
	public boolean equals(Object a)
	{
		Car c3=(Car)a;
		if(this.price==c3.price && this.brand.equals(c3.brand))
			return true;
		return false;
	}
}
 
public class Cls {
	public static void main(String[] args) {
		 Car c1= new Car(50000, "TATA");
		 Car c2= new Car(20000, "Hun");
		 Car c3= new Car(50000, "TATA");
		 Car c4=c1;
		 System.out.println(c1==c3); 
		 System.out.println(c3==c4);
		 System.out.println(c4==c1);
		 System.out.println(c1.equals(c3)); 
		 System.out.println(c3.equals(c4));
		 System.out.println(c4.equals(c1));
		  
	}
	}
