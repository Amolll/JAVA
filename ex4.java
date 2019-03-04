interface Vehicle
{
	String name="Vehicle";
	int maxPassanger=5, maxSpeed=200;	
}
interface LandVehicle extends Vehicle
{
	int no_of_wheels=4;
	public void drive();
} 
interface SeaVehicle extends Vehicle
{
	int displacement=100;
	public void launch();
}
class Car implements LandVehicle
{
	public void drive()
	{
		System.out.println("***** Car Info*****");
		System.out.println("\n Name Of Vehicle:"+name);
		System.out.println("\n Max Speed Of Vehicle:"+maxSpeed);
		System.out.println("\n  Max Passanger:"+maxPassanger);
		System.out.println("\n Number Of Wheels Are:"+no_of_wheels);
		System.out.println("*****************************************");	
	}	
}
class HoverCraft implements LandVehicle,SeaVehicle
{
	 public void drive()
	 {
		 System.out.println("***** HoverCraft Info*****");
		 System.out.println("\n Name Of Vehicle:"+name);
		System.out.println("\n Max Speed Of Vehicle:"+maxSpeed);
		System.out.println("\n  Max Passanger:"+maxPassanger);
		System.out.println("\n Number Of Wheels Are:"+no_of_wheels);
		System.out.println("*****************************************");
	 }
	 public void launch()
	 {
		 System.out.println("***** Hovercraft Info*****");
		System.out.println("\n Name Of Vehicle:"+name);
		System.out.println("\n Max Speed Of Vehicle:"+maxSpeed);
		System.out.println("\n  Max Passanger:"+maxPassanger);
		System.out.println("\n Number Of Wheels Are:"+no_of_wheels);
		System.out.println("*****************************************");
	 }
}
class Ship implements SeaVehicle
{
	public void launch()
	{
		System.out.println("***** Ship Info*****");
		System.out.println("\n Name Of Vehicle:"+name);
		System.out.println("\n Max Speed Of Vehicle:"+maxSpeed);
		System.out.println("\n  Max Passanger:"+maxPassanger);
		System.out.println("\n Displacement Is:"+displacement);
		System.out.println("*****************************************");
	}
} 
class ex4
{
	public static void main(String arg[])
	{
		Ship s=new Ship();
		HoverCraft hc=new HoverCraft();
		Car c=new Car();
		c.drive();
		hc.drive();
		hc.launch();
		s.launch();	
	}
}
