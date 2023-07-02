public class Paralyze extends Status
{
	private int numberOfTurns;

	public Paralyze(int numberOfTurns)
	{
		super("Paralyze");
		this.numberOfTurns = numberOfTurns;
	}
	public int getNumberOfTurns()
	{
		return this.numberOfTurns;
	}
}