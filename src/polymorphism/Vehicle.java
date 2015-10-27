package polymorphism;

public abstract class Vehicle
{
	// members:
	private boolean isStarted = false;
	
	// methods:
	public void Start()
	{
		System.out.print("Starting Vehicle");
		this.isStarted = true;
	}
	
	public void Drive()
	{
		if (this.isStarted)
		{
			System.out.print("Driving Vehicle");
		}
		else
		{
			System.out.print("Start the vehicle first");
		}
	}
}
