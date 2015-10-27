import interfaces.CarB;
import interfaces.ConvertibleB;
import interfaces.Drivable;
import polymorphism.CarA;
import polymorphism.ConvertibleA;
import polymorphism.Vehicle;

/**
*
* @author johnr
*/

public class Program
{
	/**
	* @param args the command line arguments
	*/
	
	public static void main(String[] args)
	{
		// Part A polymorphism:
		
		CarA carPoly = new CarA();
		ConvertibleA convertiblePoly = new ConvertibleA();
		
		System.out.println("Part A - Polymorphism");
		
		// Make the tests print true:
		System.out.println("Car is a vehicle: " + (carPoly instanceof Vehicle));
		System.out.println("Convertible is a vehicle: " + (convertiblePoly instanceof Vehicle));
		System.out.println("Car is not a convertible: " + !(carPoly instanceof ConvertibleA));
		System.out.println("Convertible is a car: " + !(convertiblePoly instanceof CarA));
		
		carPoly.Drive();
		carPoly.Start();
		carPoly.Drive();
		// expected output:
		// 		start the vehicle first
		// 		Starting vehicle
		// 		Driving vehicle
		
		convertiblePoly.Start();
		convertiblePoly.PutTopDown();
		convertiblePoly.PutTopDown();
		convertiblePoly.Drive();
		// expected output:
		// 		Starting vehicle
		// 		Putting top down
		// 		Top already down
		// 		Driving vehicle
		
		// Part B convertible:
		
		CarB carDrivable = new CarB();
		ConvertibleB convertibleDrivable = new ConvertibleB();
		
		System.out.println("Part B - interface");
		
		// Make the tests print true:
		
		// 		Why don't these compile?
		// System.out.println("Is car a convertible? " + (carDrivable instanceof ConvertibleB));
		// System.out.println("Is convertible a car? " + (convertibleDrivable instanceof CarB));
		
		//		Why do these compile?
		System.out.println("CarPoly is not drivable: " + !(carPoly instanceof Drivable));
		System.out.println("ConvertiblePoly is not drivable: " + !(convertiblePoly instanceof Drivable));
		System.out.println("CarDrivable is drivable: " + (carDrivable instanceof Drivable));
		System.out.println("ConvertibleB is drivable: " + (convertibleDrivable instanceof Drivable));
		
		carDrivable.Drive();
		carDrivable.Start();
		carDrivable.Drive();
		// Expected output:
		// 		Start the vehicle first
		// 		Starting vehicle
		// 		Driving Vehicle
		
		convertibleDrivable.Start();
		convertibleDrivable.PutTopDown();
		convertibleDrivable.PutTopDown();
		convertibleDrivable.PutTopUp();
		convertibleDrivable.Drive();
		// Expected output:
		//		Starting vehicle
		//		Putting top down
		//		Top already down
		//		Putting top up
		//		Driving vehicle
	}
}
