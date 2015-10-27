package polymorphism;

public class ConvertibleA extends CarA
{
	// members:
	private boolean isTopUp = true;
	
	public void PutTopUp()
	{
		if (this.isTopUp)
		{
			System.out.print("Top is already up");
		}
		else
		{
			System.out.print("Putting top up");
			this.isTopUp = true;
		}
	}
	
	public void PutTopDown()
	{
		if (this.isTopUp)
		{
			System.out.print("Putting top down");
			this.isTopUp = false;
			
		}
		else
		{
			System.out.print("Top is already down");
		}
	}
}
