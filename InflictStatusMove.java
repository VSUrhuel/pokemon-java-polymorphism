import java.util.*;
public class InflictStatusMove extends Move
{
	private double probability;
	private Status status;

	public InflictStatusMove(String name, int maxPowerPoint, Status status, double probability)
	{
		super(name, maxPowerPoint);
		this.status = status;
		this.probability = probability;
	}
	public double getProbability()
	{
		return this.probability;
	}
	@Override
	public boolean executeMove(Pokemon pokemon)
	{
		if(!super.executeMove(pokemon))
			return false;

		Random r = new Random();
		if(r.nextDouble() > this.probability)
			return false;

		pokemon.addStatus(this.status);
		super.powerPoint--;
		return true;
	}
}