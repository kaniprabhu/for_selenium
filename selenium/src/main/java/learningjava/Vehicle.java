package learningjava;

class Vehicle {

	 Vehicle()
	   {
		System.out.println("Class Vehicle");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
class Car extends Vehicle{
	   Car()
	   {
		System.out.println("Class Car");
	   }
	   public void brand()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
class Audi extends Car{

	  Audi()
	   {
		System.out.println("Car Model: Audi");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
}
class MultiLevelInheritanceMain{
	   public static void main(String args[])
	   {
		 Audi obj=new Audi();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}